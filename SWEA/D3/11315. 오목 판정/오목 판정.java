import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
    static int[][] dr = {{0,1}, {1, 0},{1,1}, {1,-1}}; 
    
	public static void main(String args[]) throws Exception
	{
		
		//System.setIn(new FileInputStream("res/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine());
        
        for (int t = 1; t <= tc; t++) {
        	int n = Integer.parseInt(br.readLine());
        	boolean flag = false;
        	boolean[][] arr = new boolean[n][n];
        	
        	for (int i = 0; i < n; i++) {
        		String input = br.readLine();
        		for (int j = 0; j < n; j++) {
        			if (input.charAt(j) == 'o') arr[i][j] = true;
        		}
        	}
        	
        	for (int i = 0; i < n && !flag; i++) {
        		for (int j = 0; j < n && !flag; j++) {
        			if (arr[i][j]) flag = check(arr, n, i, j);
        		}
        	}
            
        	sb.append(String.format("#%d %s\n", t, flag? "YES": "NO"));
        }
        
        System.out.print(sb);
        br.close();
    }
    
    static boolean check(boolean[][] arr, int n, int r, int c) {
    	
    	for (int d = 0; d < 4; d++) {
    		int x = r + dr[d][0], y = c + dr[d][1], cnt = 1;
    		
    		while (0 <= x && x < n && 0 <= y && y < n && arr[x][y]) {
    			cnt++;
    			x += dr[d][0];
    			y += dr[d][1];
    		}
    		
    		if (cnt >= 5) return true;
    	}
    	return false;
    }
}