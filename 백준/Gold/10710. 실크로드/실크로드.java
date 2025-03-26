import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int[] d = new int[n], c = new int[m];
		for (int i = 0; i < n; i++) d[i] = Integer.parseInt(br.readLine());
		for (int i = 0; i < m; i++) c[i] = Integer.parseInt(br.readLine());

		int[][] dp = new int[n][m];
		for (int i = 0; i < m; i++) dp[0][i] = d[0] * c[i];
		for (int i = 1; i < n; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < m; j++) {
				if (j >= i) dp[i][j] = min + d[i] * c[j];
				else dp[i][j] = min;
				min = Math.min(min, dp[i-1][j]);
			}
		}
		
		int ans = Integer.MAX_VALUE;
		for (int i = n-1; i < m;i++) ans = Math.min(ans, dp[n-1][i]);
		
		System.out.println(ans);
		br.close();
	}
}