import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		//System.setIn(new FileInputStream("res/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        
        int tc = Integer.parseInt(br.readLine());
        
        for (int t = 1; t <= tc; t++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int n = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken());
        	int[][] arr = new int[n][2], dp = new int[n+1][l+1];
        	
        	for (int i = 0; i < n; i++) {
        		st = new StringTokenizer(br.readLine(), " ");
        		for (int j = 0; j < 2; j++) arr[i][j] = Integer.parseInt(st.nextToken());
        	}
        	
        	for (int i = 0; i < n; i++) {
        		for (int j = 0; j <= l; j++) {
        			dp[i+1][j] = Math.max(dp[i][j], dp[i+1][j]);
        			if (j + arr[i][1] <= l) dp[i+1][j+arr[i][1]] = Math.max(dp[i+1][j+arr[i][1]], dp[i][j] + arr[i][0]); 
        		}
        	}
        	
        	sb.append(String.format("#%d %d\n", t, dp[n][l]));
        }
        
        System.out.print(sb);
        br.close();
    }
}