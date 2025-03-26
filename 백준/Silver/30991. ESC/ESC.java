import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[][] dp = new long[n+1][3]; // dp[i] = {a_n, b_n, c_n};
		dp[0][2] = 1;
		
		for (int i = 1; i <= n; i++) {
			dp[i][0] = -dp[i-1][2] + dp[i-1][0];
			dp[i][1] = dp[i-1][2] + dp[i-1][1];
			dp[i][2] = dp[i-1][2] - 2*dp[i-1][1] + 2*dp[i-1][0];
		}

		System.out.println(Arrays.stream(dp[n]).sum());
		br.close();
	}
}