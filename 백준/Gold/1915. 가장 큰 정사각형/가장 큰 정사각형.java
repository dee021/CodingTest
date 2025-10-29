import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	static int[][] dp;

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), max = 0;
        dp = new int[n][m];
        
        for (int i = 0; i < n; i++) {
        	String line = br.readLine();
        	for (int j = 0; j < m; j++) {
        		if (line.charAt(j) == '0') dp[i][j] = 0;
        		else { 
        			dp[i][j] = isSquare(i, j);
        		}
        		max = Math.max(max, dp[i][j]);
        	}
        }
        
        System.out.println(max*max);
        br.close();
    }
    
    static int isSquare(int i, int j) {
    	if (i == 0 || j == 0) return 1;
    	int a = dp[i-1][j], b = dp[i][j-1], c = dp[i-1][j-1];
    	int min = Math.min(Math.min(a, b), c);
    	return min +1;
    }
}