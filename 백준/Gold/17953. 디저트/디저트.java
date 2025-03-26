import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[m][], dp = new int[n][m];
		for (int i = 0; i < m; i++) {
			arr[i] = Arrays.asList(br.readLine().strip().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
			dp[0][i] = arr[i][0];
		}
		
		
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int max = 0;
				for (int k = 0; k < m; k++) {
					if (j == k) continue;
					max = Math.max(dp[i-1][k], max);
				}
				dp[i][j] = Math.max(max + arr[j][i], dp[i-1][j] + arr[j][i]/2);
			}
		}
		
		System.out.println(Arrays.stream(dp[n-1]).max().getAsInt());
		br.close();
	}
}