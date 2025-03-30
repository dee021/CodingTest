import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n, s, t;
		int[] arr;
		int[][] dp;
		
		while (true) {
			n = Integer.parseInt(st.nextToken());
			if (n == 0) break;
			s = Integer.parseInt(st.nextToken());
			t = Integer.parseInt(st.nextToken());
			arr = new int[n+1];
			dp = new int[n+1][t];
			for (int i = 0; i < n; i++) {
				if (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine(), " ");
				arr[i] = Integer.parseInt(st.nextToken());
				Arrays.fill(dp[i], Integer.MIN_VALUE);
				if (i < s)dp[i][0] = arr[i];
			}
			Arrays.fill(dp[n], Integer.MIN_VALUE);
			for (int i = 1; i < t; i++) {
				for (int j = 0; j < n+1; j++) {
					if (j == n && dp[j][i-1] > Integer.MIN_VALUE) dp[j][i] = dp[j][i-1];
					for (int k = 1; k <= s && j >= k; k++)
						if (dp[j-k][i-1] > Integer.MIN_VALUE)
						dp[j][i] = Math.max(dp[j][i], dp[j-k][i-1] + arr[j]);
				}
			}
			
			System.out.println(dp[n][t-1]);
			st = new StringTokenizer(br.readLine(), " ");
		}
		br.close();
	}
}