import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = 10_000, tmp;
		int[] sum = new int[n+1];
		int[][] dp = new int[n+1][4];
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < 4 && i >= j; j++) {
				tmp = 0;
				for (int k = 1; k < j; k++) tmp += dp[i-j][k];
				dp[i][j] = sum[i-j] - tmp;
				if (i == j) dp[i][j]++;
				sum[i] += dp[i][j];
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			n = Integer.parseInt(br.readLine());
			sb.append(sum[n]+ "\n");
		}

		System.out.println(sb);
		br.close();
	}
}