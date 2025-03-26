import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] s = br.readLine().strip().toCharArray(), t = br.readLine().strip().toCharArray();
		int[][] dp = new int[s.length][t.length];
		
        for (int i = 0; i < t.length; i++) if (s[0] == t[i] || (i > 1 && dp[0][i-1] == 1)) dp[0][i] = 1;
		for (int i = 1; i < s.length; i++) {
			if (s[i] == t[0] || dp[i-1][0] == 1) dp[i][0] = 1;
			for (int j = 1; j < t.length; j++) {
				dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				if (s[i] == t[j]) dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1]+1);
			}
		}

		System.out.println(dp[s.length -1][t.length -1]);
		br.close();
	}
}