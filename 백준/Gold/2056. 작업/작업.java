import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[][] pre;
	static int[] dp, time; 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		time = new int[n+1];
		pre = new int[n+1][];
		for (int i = 1; i < n+1; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			time[i] = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			pre[i] = new int[c+1];
			pre[i][0] = c;
			for (int j = 1; j < c+1; j++) pre[i][j] = Integer.parseInt(st.nextToken());
		}
		
		dp = new int[n+1];
		int answer = 0;
		for (int i = 2; i < n+1; i++) {
			answer = Math.max(getTime(i), answer);
		}
		
		System.out.println(answer);
		br.close();
	}
	
	static int getTime(int no) {
		if (dp[no] > 0) return dp[no];
		if (pre[no][0] == 0) {
			dp[no] = time[no];
			return dp[no];
		}
		int res = 0;
		for (int i = 1; i < pre[no][0]+1; i++) {
			if (dp[pre[no][i]] == 0) dp[pre[no][i]] = getTime(i);
			res = Math.max(dp[pre[no][i]], res);
		}
		dp[no] = res + time[no];
		return dp[no];
	}
}