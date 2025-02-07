import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		long M = 1_000_000_009;
		int big = 100_000;
		long[][] dp = new long[big+1][2];
        // dp[i][0] = even, dp[i][1] = odd
		dp[0][0] = 1;
		
		for (int i = 1; i <= big; i++) {
			for (int k = 1; k <= 3 && i >= k; k++) {
				dp[i][0] += dp[i-k][1];
				dp[i][1] += dp[i-k][0];
			}
            dp[i][0] %= M;
			dp[i][1] %= M;
		}

		int t = Integer.parseInt(br.readLine()), n;
		
		for (int i = 0; i < t; i++) {
			n = Integer.parseInt(br.readLine());
			sb.append(dp[n][1] + " " + dp[n][0] + "\n");
		}

		System.out.println(sb);

		br.close();
	}
}