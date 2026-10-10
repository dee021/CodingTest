import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

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
        	int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), cnt = 0;
        	int[] sec = new int[n];
        	
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int i = 0; i < n; i++) sec[i] = Integer.parseInt(st.nextToken());
        	Arrays.sort(sec);
        	
        	boolean ispossible = true;
        	for (int i = 0; i < n; i++) {
        		cnt = sec[i] / m * k;
        		if (cnt < i+1) {
        			ispossible = false;
        			break;
        		}
        	}
        	sb.append(String.format("#%d %s\n", t, ispossible? "Possible": "Impossible"));
        }
        
        System.out.print(sb);
        br.close();
    }
}