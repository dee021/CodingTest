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
        
        int[][] arr = new int[100][100];
        
        for (int t = 1; t <= 10; t++) {
        	br.readLine();
        	
        	int ans = 0;
        	
        	for (int r = 0; r < 100; r++) {
        		st = new StringTokenizer(br.readLine(), " ");
        		for (int c = 0; c < 100; c++) arr[r][c] = Integer.parseInt(st.nextToken());
        	}
        	
        	for (int c = 0; c < 100; c++) {
        		boolean flag = false;
        		for (int r = 0; r < 100; r++) {
        			if (arr[r][c] == 1) flag = true;
        			else if (arr[r][c] == 2 && flag) {
        				flag = false;
        				ans++;
        			}
        		}
        	}
        	
        	sb.append(String.format("#%d %d\n", t, ans));
        	
        }
        
        System.out.print(sb);
        br.close();
    }
}