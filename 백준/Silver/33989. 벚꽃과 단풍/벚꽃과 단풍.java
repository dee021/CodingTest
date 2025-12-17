import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), ans = 0;
        char[] coins = br.readLine().toCharArray();
        int[][] dp = new int[n+1][2];
        
        for (int i = 1; i <= n; i++) {
        	if (coins[i-1] == 'B') { // 
        		dp[i][0] = dp[i-1][0];
        		dp[i][1] = Math.min(dp[i-1][0], dp[i-1][1]) +1;
        	} else {
        		dp[i][0] = dp[i-1][0] +1;
        		dp[i][1] = Math.min(dp[i-1][0], dp[i-1][1]);
        	}
        }
        
        System.out.println(Math.min(dp[n][0], dp[n][1]));
        br.close();
    }
}