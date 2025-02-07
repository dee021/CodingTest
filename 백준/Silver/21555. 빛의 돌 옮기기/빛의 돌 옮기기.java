import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		long[][] dp = new long[n][2], ab = new long[n][2];
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) ab[i][0] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) ab[i][1] = Integer.parseInt(st.nextToken());
		
		dp[0] = ab[0];
		for (int i = 1; i < n; i++) {
			dp[i][0] = Math.min(dp[i-1][0] + ab[i][0], dp[i-1][1] + ab[i][0] + k);
			dp[i][1] = Math.min(dp[i-1][0] + ab[i][1] + k, dp[i-1][1] + ab[i][1]);
		}

		System.out.println(Math.min(dp[n-1][0], dp[n-1][1]));

		br.close();
	}
}