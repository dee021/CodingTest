import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        int[] dp = new int[n+1];
        dp[1] = 1;
        
        for (int i = 1; i <= n; i++) {
        	if (dp[i] > 0 && dp[i] < k) {
        		if (i+1 <= n && dp[i+1] < 1) dp[i+1] = dp[i] +1;
        		if (i/2 + i <= n && dp[i/2 + i] < 1) dp[i/2 + i] = dp[i] +1;
        	}
        }
        
        System.out.println(dp[n] > 0? "minigimbob" : "water");
        br.close();
    }
}