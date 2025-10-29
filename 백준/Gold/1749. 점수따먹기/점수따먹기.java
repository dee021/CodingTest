import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), max = Integer.MIN_VALUE;
        int[][] dp = new int[n+1][m+1];
        
        for (int i = 1; i < n+1; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int j = 1; j < m+1; j++) {
        		int e = Integer.parseInt(st.nextToken());
        		dp[i][j] = e + dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1];
        		
        		for (int u = 0; u < i; u++) {
        			for (int v = 0; v < j; v++) {
        				int tmp = dp[i][j] - dp[i][v] - dp[u][j] + dp[u][v];
        				max = Math.max(max, tmp);
        			}
        		}
        		
        	}
        	
        }
        
        System.out.println(max);
        br.close();
    }
}