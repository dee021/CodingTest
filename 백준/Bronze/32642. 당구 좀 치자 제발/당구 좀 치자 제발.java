import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long ans = 0;
        int[] dp = new int[n+1];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for (int i = 1; i < n+1; i++) {
        	if (Integer.parseInt(st.nextToken()) == 1) dp[i] = dp[i-1] +1;
        	else dp[i] = dp[i-1] -1;
        	ans += dp[i];
        }
        
        System.out.println(ans);
        
        br.close();
    }
}