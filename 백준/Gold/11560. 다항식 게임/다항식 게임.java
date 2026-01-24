import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        long[][] dp = new long[21][10*21+1];
        dp[1][1] = dp[1][0] = 1;
        
        for (int k = 1; k < 20; k++) {
        	for (int n = 0; n <= k*(k+1)/2; n++) {
        		for (int _k = k+1; _k > -1; _k--) dp[k+1][n+_k] += dp[k][n];
        	}
        }
        
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int k = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
        	sb.append(dp[k][n]).append("\n");
        }
        
        System.out.println(sb);
        br.close();
    }
}