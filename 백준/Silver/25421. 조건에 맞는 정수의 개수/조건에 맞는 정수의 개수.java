import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        long M = 987_654_321;
        long[][] dp = new long[n][10];
        
        for (int i = 1; i < 10; i++) dp[0][i] = 1;
        
        for (int k = 1; k < n; k++) {
        	for (int i = 1; i < 10; i++) {
        		for (int j = Math.max(1, i - 2); j < Math.min(10, i + 3); j++) {
        			dp[k][i] += dp[k-1][j];
        			dp[k][i] %= M;
        		}
        	}
        }
        
        long res = 0;
        for (int i = 1; i < 10; i++) {
        	res += dp[n-1][i];
        	res %= M;
        }
        
        System.out.println(res);
        br.close();
    }
}