import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()), max = 0, d;
		int[][] dp = new int[n+1][2];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 1; i < n+1; i++) {
			d = Integer.parseInt(st.nextToken());
			if (d == 1) {
				dp[i][0] = dp[i-1][0] + 1;
				dp[i][1] = Math.max(0, dp[i-1][1] -1);
				max = Math.max(max, dp[i][0]);
			} else {
				dp[i][0] = Math.max(0, dp[i-1][0] -1);
				dp[i][1] = dp[i-1][1] +1;
				max = Math.max(max, dp[i][1]);
			}
		}
		
		System.out.println(max);
		br.close();
	}
}