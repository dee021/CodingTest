import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		boolean[][] dp = new boolean[n+1][7];
		dp[0][0] = true;
		
		for (int i = 1; i < n+1; i++) {
			for (int j = 0; j < 7; j++) {
				if (dp[i-1][j]) {
					dp[i][j] = true;
					dp[i][(j + arr[i-1])%7] = true;
				}
			}
		}
		
		
		
		System.out.println(dp[n][4]?"YES":"NO");
		br.close();
	}
}