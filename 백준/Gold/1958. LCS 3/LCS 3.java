import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] a = br.readLine().toCharArray(), b = br.readLine().toCharArray(), c = br.readLine().toCharArray();
		int[][][] dp = new int[a.length+1][b.length+1][c.length+1];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				for (int k = 0; k < c.length; k++) {
					if (a[i] == b[j] && b[j] == c[k]) {
						dp[i+1][j+1][k+1] = dp[i][j][k] +1;
					} else {
						dp[i+1][j+1][k+1] = Math.max(dp[i][j+1][k+1], Math.max(dp[i+1][j][k+1], dp[i+1][j+1][k]));
					}
				}
			}
		}
		
		System.out.println(dp[a.length][b.length][c.length]);
        br.close();
    }
}