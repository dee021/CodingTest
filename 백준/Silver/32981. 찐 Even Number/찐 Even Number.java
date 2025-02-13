import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = 10_000_000;
		final long M = 1_000_000_007;
		long[] dp = new long[n+1];
		dp[1] = 5;dp[2] = 20;
		for (int i = 3; i < n+1; i++) dp[i] = (dp[i-1]*5)%M;

		int q = Integer.parseInt(br.readLine());
		for (int i = 0; i < q; i++) sb.append(dp[Integer.parseInt(br.readLine())]+"\n");
		System.out.println(sb);
		br.close();
	}
}