import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int h = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken()), w = Math.abs(h-n)+1;
        long[][] dp = new long[w][w];
        dp[0][0] = 1;
        
        for (int r = 0 ; r < w; r++) {
        	for (int c = 0; c <= r; c++) {
        		if (r < w-1) dp[r+1][c] += dp[r][c];
        		if (c < r) dp[r][c+1] += dp[r][c];
        	}
        }
        System.out.println(dp[w-1][w-1]);
        br.close();
    } 
}