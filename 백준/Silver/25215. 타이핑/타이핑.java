import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().trim();;
        int[][] dp = new int[s.length()+1][2]; // dp[i] = {lowerBase, upperBase}
        dp[0][1] = 1;
        
        for (int i = 1; i < s.length()+1; i++) {
        	if (s.charAt(i-1) < 97) { // upper
        		dp[i][0] = Math.min(dp[i-1][0], dp[i-1][1]) + 2;
        		dp[i][1] = Math.min(dp[i-1][0] + 2, dp[i-1][1] + 1);
        	} else { // lower
        		dp[i][0] = Math.min(dp[i-1][0] +1, dp[i-1][1] + 2);
        		dp[i][1] = Math.min(dp[i-1][0], dp[i-1][1]) + 2;
        	}
        }

        System.out.println(Math.min(dp[s.length()][0], dp[s.length()][1]));
        br.close();
    }
}