import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) solution();
		br.close();
	}
	
	private static void solution() throws IOException {
		st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int[][] st1 = new int[2][n], st2 = new int[2][n], dp = new int[n+1][2];
		
		for (int i = 0; i < 2; i++) {
			dp[(i == 0? 0: n)][0] = Integer.parseInt(st.nextToken());
			dp[(i == 0? 0: n)][1] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < n-1; j++) {
				st1[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < n-1; j++) {
				st2[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 1; i < n; i++) {
			dp[i][0] = Math.min(dp[i-1][0] + st1[1][i-1], dp[i-1][1] + st2[0][i-1]);
			dp[i][1] = Math.min(dp[i-1][1] + st2[1][i-1], dp[i-1][0] + st1[0][i-1]);
		}
		
		System.out.println(Math.min(dp[n-1][0] + dp[n][0], dp[n-1][1] + dp[n][1]));
		
	}
}