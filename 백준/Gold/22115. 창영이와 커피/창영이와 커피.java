import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n+1];
		int[][] dp = new int[n+1][k+1];
		Arrays.fill(dp[0], 101);
		dp[0][0] = 0;
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i < n+1; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			Arrays.fill(dp[i], 101);
			if (arr[i] <= k) dp[i][arr[i]] = 1;
		}
		
		for (int i = 1; i < n+1; i++) {
			for (int j = 0; j < k+1; j++) {
				if (dp[i-1][j] < 101 && j + arr[i] <= k) dp[i][j + arr[i]] = Math.min(dp[i][j + arr[i]], dp[i-1][j]+1);
				dp[i][j] = Math.min(dp[i][j], dp[i-1][j]);
			}
		}
		System.out.println(dp[n][k] < 101? dp[n][k]:-1);
		br.close();
	}
}