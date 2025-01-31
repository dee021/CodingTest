import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = 1000, M = 1_000_000_009, m;
		long[][] dp = new long[n+1][n+1], sum = new long[n+1][n+1];
		dp[0][0] = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				for (int k = 1; k <= 3 && i >= k; k++)
					dp[i][j] += dp[i-k][j-1];
				dp[i][j] %= M;
				sum[i][j] = (sum[i][j-1] + dp[i][j])%M;
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			sb.append(sum[n][m]+"\n");
		}

		System.out.println(sb);
		br.close();
	}
}