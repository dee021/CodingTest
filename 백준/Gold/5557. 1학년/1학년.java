import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int [] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		long[][] dp = new long[n-1][21];
		dp[0][arr[0]]++;
		if (arr[0] + arr[1] <= 20) dp[1][arr[0] + arr[1]]++;
		if (arr[0] >= arr[1]) dp[1][arr[0] - arr[1]]++;

		for (int i = 2; i < n-1; i++) {
			for (int k = 0; k < 21; k++) {
				if (dp[i-1][k] > 0) {
					if (k + arr[i] <= 20) dp[i][k + arr[i]] += dp[i-1][k];
					if (k >= arr[i]) dp[i][k-arr[i]] += dp[i-1][k];
				}
			}
		}
		
		System.out.println(dp[n-2][arr[n-1]]);
		br.close();
	}
}