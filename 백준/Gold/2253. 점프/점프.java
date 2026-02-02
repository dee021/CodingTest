import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int[][] dp = new int[n+1][200]; // sigma(1, 200)(k) > 10000
        
        for (int i = 0; i < m; i++) dp[Integer.parseInt(br.readLine())][0] = -1;
        
        dp[2][1] = dp[2][0] == -1? -1: 1;
        
        for (int stone = 2; stone < n+1; stone++) {
        	if (dp[stone][0] < 0) continue;
        	for (int v = 1; v <= Math.min(stone, 199); v++) {
        		if (dp[stone][v] > 0) {
        			for (int dv = -1; dv < 2; dv++) {
        				if (v + dv > 0 && v + dv < 200 && stone + v + dv <= n) {
        					if (dp[stone + v + dv][v + dv] > 0) dp[stone + v + dv][v + dv] = Math.min(dp[stone + v + dv][v + dv], dp[stone][v]+1);
        					else dp[stone + v + dv][v + dv] = dp[stone][v] +1;
        				}
        			}
        		}
        	}
        }
        
        int ans = 10001;
        for (int v = 1; v <= Math.min(n, 199); v++) if (dp[n][v] > 0) ans = Math.min(ans, dp[n][v]);
        
        System.out.println(ans < 10001? ans: -1);
        br.close();
    }
}