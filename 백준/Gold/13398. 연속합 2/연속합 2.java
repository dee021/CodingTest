import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()), max = -1001;
		int[] arr = new int [n+2];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 2; i < n+2; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		int[][] dp = new int[n+2][2];
		
		for (int i = 2; i < n+2; i++) {
			dp[i][0] = Math.max(dp[i-1][0], 0) + arr[i];
			dp[i][1] = Math.max(dp[i-2][0], Math.max(dp[i-1][1], 0)) + arr[i];
			
			max = Math.max(max, Math.max(dp[i][0], dp[i][1]));
		}

		System.out.println(max);
		br.close();
	}
}