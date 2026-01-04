import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine()), M = 1_000_000;
        int[][] dp = new int[n][7];
        dp[0][0] = dp[0][1] = dp[0][3] = 1;
        
        // dp[i] = {l, o-l0, o-l1, a1-l0, a1-l1, a2-l0, a2-l1}
        
        /*
         * l = o-l0 + a1-l0 + a2-l0
         * o-10 = o-l0 + a1-l0 + a2-l0
         * o-l1 = l + o-l1 + a1-l1 + a2-l1
         * a1-l0 = o-l0
         * al-l1 = l + o-l1
         * a2-l0 = a1-l0
         * a2-l1 = al-l1
         * */
        
        for (int i = 1; i < n; i++) {
        	dp[i][0] = (dp[i-1][1] + dp[i-1][3] + dp[i-1][5]) % M;
        	dp[i][1] = (dp[i-1][1] + dp[i-1][3] + dp[i-1][5]) % M;
        	dp[i][2] = (dp[i-1][0] + dp[i-1][2] + dp[i-1][4] + dp[i-1][6]) % M;
        	dp[i][3] = dp[i-1][1];
        	dp[i][4] = (dp[i-1][0] + dp[i-1][2]) % M;
        	dp[i][5] = dp[i-1][3];
        	dp[i][6] = dp[i-1][4];
        }
        
        int ans = 0;
        for (int i = 0; i < 7; i++) {
        	ans = (ans + dp[n-1][i])%M;
        }
        
        System.out.println(ans);
        br.close();
    }
}