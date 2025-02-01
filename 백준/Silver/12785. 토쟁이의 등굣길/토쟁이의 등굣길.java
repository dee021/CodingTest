import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int M = 1_000_007;
		int w = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
		int[][] dp = new int[w][h];
		Arrays.fill(dp[0], 1);
		
		for (int i = 1; i < x; i++) {
			dp[i][0] = 1;
			for (int j = 1; j < y; j++) {
				dp[i][j] = (dp[i-1][j]+dp[i][j-1])%M;
			}
		}
		
		Arrays.fill(dp[x-1], dp[x-1][y-1]);
		for (int i = x; i < w; i++) {
			dp[i][y-1] = dp[x-1][y-1];
			for (int j = y; j < h; j++)
				dp[i][j] = (dp[i-1][j]+dp[i][j-1])%M;
		}
        
		System.out.println(dp[w-1][h-1]);
		br.close();
	}
}