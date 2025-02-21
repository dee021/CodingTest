import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		final long M = 1_000_000_007;
		long dp[][] = new long[n+1][2];
		dp[1] = new long[] {2, 1};
		for (int i = 2; i < n+1 ; i++) {
			dp[i][1] = dp[i-1][0];
			dp[i][0] = (dp[i-1][0] + dp[i-1][1])*2%M;
		}
		
		System.out.println((dp[n][0] + dp[n][1])%M);
		br.close();
	}
}