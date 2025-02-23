import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		final long M = 1_000_000_007;
		long[] dp = new long[Math.max(4, n+1)];
		dp[3] = dp[2] = 1;
		for (int i = 4; i <= n; i++) {
			dp[i] = (dp[i-1] + dp[i-2]*2)%M;
		}
		System.out.println(dp[n]);
		br.close();
	}
}