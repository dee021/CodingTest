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
        	
        	int n = Integer.parseInt(br.readLine()), sum = 0, cnt = 1;
        	int[] arr = new int[n];
        	st = new StringTokenizer(br.readLine(), " ");
        	
        	for (int i = 0; i < n; i++) {
        		arr[i] = Integer.parseInt(st.nextToken());
        		sum += arr[i];
        	}
        	
        	boolean[] dp = new boolean[sum+1];
        	dp[0] = true;
        	
        	for (int i = 0; i < n; i++) {
        		for (int s = sum; s > -1; s--) {
        			if (dp[s] && !dp[arr[i]+s]) {
        				dp[s+arr[i]] = true;
        				cnt++;
        			}
        		}
        	}
        	sb.append(String.format("#%d %d\n", t, cnt));
        }
        
        System.out.println(sb);
        br.close();
    }
}