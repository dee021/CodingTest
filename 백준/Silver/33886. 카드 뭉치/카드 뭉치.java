import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n], dp = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for (int i = 0; i < n; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.fill(dp, Integer.MAX_VALUE);
        
        for (int i = 0; i < n; i++) {
        	for (int j = Math.min(n-1, i + arr[i]-1); j >= i; j--) {
        		dp[j] = Math.min(dp[j], i > 0? dp[i-1] + 1: 1);
        	}
        }
        
        System.out.println(dp[n-1]);
        br.close();
    } 
}