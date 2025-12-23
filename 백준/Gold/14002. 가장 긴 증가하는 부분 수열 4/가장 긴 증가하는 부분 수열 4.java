import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), max = 0, leaf = 0;
        int[] arr = new int[n+1];
        int[][] dp = new int[n+1][2];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for (int i = 1; i < n+1; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        	
        	if (arr[i] > arr[leaf]) {
        		dp[i] = new int[] {leaf, dp[leaf][1] +1};
        	} else {
        		for (int j = 0; j < i; j++) {
        			if (arr[i] > arr[j] && dp[j][1] >= dp[i][1]) {
        				dp[i] = new int[] {j, dp[j][1] +1};
        			}
        		}
        	}
        	
        	if (max < dp[i][1]) {
        		max = dp[i][1];
        		leaf = i;
        	}
        }
        
        System.out.println(max);
        System.out.println(nums(leaf, arr, dp));
        
        br.close();
    }
    
    static String nums(int leaf, int[] arr, int[][] dp) {
    	if (leaf == 0) return "";
    	
    	return nums(dp[leaf][0], arr, dp) + arr[leaf] + " ";
    }
}