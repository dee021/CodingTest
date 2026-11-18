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
        	int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), max = 0;
        	int[] arr = new int[n+m+1];
        	
        	for (int i = 1; i <= n; i++) {
        		for (int j = 1; j <= m; j++) {
        			arr[i+j]++;
        			max = Math.max(max, arr[i+j]);
        		}
        	}
        	sb.append(String.format("#%d ", t));
        	
        	for (int i = 1; i <= n+m; i++) if (arr[i] == max) sb.append(i).append(" ");
        	sb.append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}