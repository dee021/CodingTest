import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()), max = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n+1];
		for (int i = 1; i < n+1; i++) arr[i] = Integer.parseInt(st.nextToken());
		int[][] dp = new int[n+1][2];
		dp[1][0] = 1;
		dp[1][1] = arr[1];
		
		for (int i = 2; i < n+1; i++) {
			dp[i][0] = Math.max(max, dp[i-1][1]) + 1;
			max = Math.max(dp[i-1][0], dp[i-1][1]);
			dp[i][1] = Math.max(max, dp[i-1][0]) + arr[i];
		}
		
		if (dp[n][0] > dp[n][1] && arr[1] > 0) System.out.println(dp[n][0]);
		else System.out.println(dp[n][1]);
		br.close();
	}
}