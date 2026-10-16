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
        int[] lis = new int[1001];
        
        for (int t = 1; t <= tc; t++) {
        	int n = Integer.parseInt(br.readLine()), len = 0;
        	st = new StringTokenizer(br.readLine(), " ");
        	
        	for (int i = 0; i < n; i++) {
        		int k = Integer.parseInt(st.nextToken());
        		
        		if (k >= lis[len]) {
        			lis[++len] = k;
        		}
        		else {
        			for (int j = 0; j < len; j++) {
        				if (lis[j] <= k && k < lis[j+1]) {
        					lis[j+1] = k;
            				break;
        				}
        			}
        		}
        	}
        	
        	sb.append(String.format("#%d %d\n", t, len));
        }
        
        System.out.print(sb);
        br.close();
    }
}