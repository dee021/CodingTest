import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int k = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		long[][] dp = new long[n+1][63*2+1];
		dp[0][k] = 1;

		for (int t = 0; t < n; t++) {
			for (int h = 1; h <= 63*2; h++) {
				if (dp[t][h] > 0) {
					dp[t+1][h-1] += dp[t][h];
					dp[t+1][h+1] += dp[t][h];
				}
			}
		}

		long ans = 0;
		for (int h = 1; h <= 63*2; h++) ans += dp[n][h];
		
		System.out.println(ans);
		br.close();
	}
}