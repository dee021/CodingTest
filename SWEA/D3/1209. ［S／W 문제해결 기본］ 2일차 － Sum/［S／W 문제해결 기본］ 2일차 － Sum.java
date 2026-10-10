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
        
        for (int t = 1; t <= 10; t++) {
        	int max = 0, d1 = 0, d2 = 0;
        	int[] cols = new int[100];
        	br.readLine();
        	
        	for (int r = 0; r < 100; r++) {
        		int rows = 0;
        		st = new StringTokenizer(br.readLine(), " ");
        		for (int c = 0; c < 100; c++) {
        			int v = Integer.parseInt(st.nextToken());
        			cols[c] += v;
        			rows += v;
        			if (r == c) d1 += v;
        			if (r == 99 - c) d2 += v;
        		}
        		max = Math.max(max, rows);
        	}
        	max = Math.max(max, Math.max(d1, d2));
        	
        	for (int c = 0; c < 100; c++) max = Math.max(max, cols[c]);
        	
        	sb.append(String.format("#%d %d\n", t, max));
        }
        
        System.out.print(sb);
        br.close();
    }
}