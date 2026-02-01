import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int idx = 0, ans = 0;
        int[][][] dp = new int[1001][16][16];
        
        try {
        	while (true) {
        		st = new StringTokenizer(br.readLine(), " ");
        		int w = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        		idx++;
        		for (int wCount = 0; wCount <= 15; wCount++) {
        			for (int bCount = 0; bCount <= 15; bCount++) {
        				if (wCount + bCount < 1)continue;
        				if (bCount ==  0) dp[idx][wCount][bCount] =  Math.max(dp[idx-1][wCount-1][bCount] + w, dp[idx-1][wCount][bCount]);
        				else if (wCount == 0) dp[idx][wCount][bCount] =  Math.max(dp[idx-1][wCount][bCount-1] + b, dp[idx-1][wCount][bCount]);
        				else dp[idx][wCount][bCount] = Math.max(dp[idx-1][wCount-1][bCount] + w, Math.max(dp[idx-1][wCount][bCount-1] + b, dp[idx-1][wCount][bCount]));
        			}
        		}
        		
        	}
        } catch (Exception e) {
        	ans = dp[idx][15][15];
        }
        
        System.out.println(ans);
        br.close();
    }
}