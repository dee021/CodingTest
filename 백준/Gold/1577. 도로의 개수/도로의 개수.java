import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		long[][] dp = new long[n+1][m+1];dp[0][0] = 1;
		int k = Integer.parseInt(br.readLine());
		int[] temp = new int[4];
		
		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 4; j++) temp[j] = Integer.parseInt(st.nextToken());
			if (temp[0] == temp[2]) {
				if (temp[1] < temp[3] && dp[temp[0]][temp[3]]%10 == 0) dp[temp[0]][temp[3]] += -1;
				else if (temp[1] > temp[3] && dp[temp[0]][temp[1]]%10 == 0) dp[temp[0]][temp[1]] += -1;
			} else if (temp[0] < temp[2] && dp[temp[2]][temp[1]]/10 == 0) dp[temp[2]][temp[1]] += -10;
			else if (temp[0] > temp[2] && dp[temp[0]][temp[1]]/10 == 0)dp[temp[0]][temp[1]] += -10;
		}
		
		for (int r = 0; r < n+1; r++) {
			for (int c = 0; c < m+1; c++) {
				if (r > 0 && c > 0) {
					if (dp[r][c] == 0) dp[r][c] = dp[r-1][c] + dp[r][c-1];
					else if (dp[r][c] == -1) dp[r][c] = dp[r-1][c];
					else if (dp[r][c] == -10) dp[r][c] = dp[r][c-1];
                    else dp[r][c] = 0;
				} else if (r == 0 && c == 0) continue;
				else dp[r][c] = (dp[r][c] == 0 ? dp[Math.max(r-1, 0)][Math.max(c-1, 0)]:0);
			}
		}
		
		System.out.println(dp[n][m]);

		br.close();
	}
}