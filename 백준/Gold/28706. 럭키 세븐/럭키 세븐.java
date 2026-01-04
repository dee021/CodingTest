import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine());
        
        while (tc-- > 0) {
        	int n = Integer.parseInt(br.readLine());
        	
        	boolean[][] dp = new boolean[n+1][7];
        	dp[0][1] = true;
        	
        	for (int i = 1; i < n+1; i++) {
        		st = new StringTokenizer(br.readLine(), " ");
        		int a = st.nextToken().equals("+")? Integer.parseInt(st.nextToken()): -Integer.parseInt(st.nextToken());
        		int b = st.nextToken().equals("+")? Integer.parseInt(st.nextToken()): -Integer.parseInt(st.nextToken());
        		for (int m = 0; m < 7; m++) {
        			if (dp[i-1][m]) {
        				if (a > 0) dp[i][(m+a)%7] = true;
        				else dp[i][(m * (-a%7))%7] = true;
        				
        				if (b > 0) dp[i][(m+b)%7] = true;
        				else dp[i][(m * (-b%7))%7] = true;
        			}
        		}
        	}
            
        	if (dp[n][0]) sb.append("LUCKY\n");
        	else sb.append("UNLUCKY\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}