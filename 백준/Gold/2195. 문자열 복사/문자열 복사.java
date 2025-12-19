import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine(), p = br.readLine();
        int[] dp = new int[s.length()+1];
        int min = 0;
        
        for (char c: p.toCharArray()) {
        	int cnt = min +1;
        	for (int i = s.length(); i > 0; i--) {
        		if (c == s.charAt(i-1)) {
        			if (dp[i-1] > 0) dp[i] = dp[i-1];
        			else dp[i] = min+1;
        			
        			cnt = Math.min(cnt, dp[i]);
        		} else dp[i] = 0;
        	}
        	
        	min = cnt;
        }
        
        System.out.println(min);
        br.close();
    }
}