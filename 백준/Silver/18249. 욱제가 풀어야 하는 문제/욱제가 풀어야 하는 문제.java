import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = 191_229;
		long M = 1000000007;
		long[] dp = new long[n+1];
		dp[1] = 1; dp[2] = 2;
		
		for (int i = 3; i < n+1; i++) {
			dp[i] = (dp[i-1] + dp[i-2])%M;
		}
		
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			sb.append(dp[Integer.parseInt(br.readLine())] + "\n");
		}

		System.out.println(sb);

		br.close();
	}
}