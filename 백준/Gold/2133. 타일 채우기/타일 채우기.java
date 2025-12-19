import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        if (n%2 > 0) System.out.println(0);
        else System.out.println(sol(n));
        br.close();
    }
    
    static int sol(int n) {
    	int[][] dp = new int[n/2][3];
    	dp[0] =  new int[] {1, 1, 1};
    	
    	for (int i = 1; i < n/2; i++) {
    		dp[i][0] = dp[i-1][0] + dp[i-1][1] + dp[i-1][2];
    		dp[i][1] = dp[i][0] + dp[i-1][1];
    		dp[i][2] = dp[i][0] + dp[i-1][2];
    	}
    	
    	return dp[n/2-1][0] + dp[n/2-1][1] + dp[n/2-1][2];
    }
}