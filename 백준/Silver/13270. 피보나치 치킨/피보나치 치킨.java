import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[][] dp = new int[n+1][2];
		dp[2] = new int[] {1, 1}; 
		if (n > 2)dp[3] = new int[] {2,2};
		
		for (int i = 4; i <= n; i++) {
			dp[i][0] = 100_000_000;
			for (int k = 2; k <= i-2; k++) {
				dp[i][0] = Math.min(dp[i][0], dp[k][0] + dp[i-k][0]);
				dp[i][1] = Math.max(dp[i][1], dp[k][1] + dp[i-k][1]);
			}
		}

		System.out.println(dp[n][0] + " " + dp[n][1]);
		br.close();
	}
}