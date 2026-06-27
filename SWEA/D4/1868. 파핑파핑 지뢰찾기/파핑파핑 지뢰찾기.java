import java.util.Scanner;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayDeque;

class Solution
{
    static int[][] res, d = {{0,1}, {0,-1}, {1, 1}, {1, 0}, {1,-1}, {-1,0}, {-1,1}, {-1,-1}};
    
	public static void main(String args[]) throws Exception
	{
		//System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());
        for (int i = 1; i <= tc; i++) {
        	int n = Integer.parseInt(br.readLine()), cnt = 0;
        	char[][] arr = new char[n][n]; 
        	for (int r = 0; r < n; r++) {
        		String line = br.readLine();
        		for (int c = 0; c < n; c++) arr[r][c] = line.charAt(c);
        	}
        	
        	res = find(arr, n);
        	
        	for (int r = 0; r < n; r++) {
        		for (int c = 0; c < n; c++) {
        			if (res[r][c] == 0) {
        				cnt++;
        				check(r, c, n);
        			}
        		}
        	}
        	
        	for (int r = 0; r < n; r++) {
        		for (int c = 0; c < n; c++) {
        			if (res[r][c] > 0) {
        				cnt++;
        			}
        		}
        	}
        	
        	sb.append(String.format("#%d %d\n", i, cnt));
        }
        
        System.out.println(sb);
        br.close();
    }
	
	static int[][] find(char[][] arr, int size) {
		int [][] res = new int[size][size];
		
		for (int r = 0; r < size; r++) {
			for (int c = 0; c < size; c++) {
				if (arr[r][c] == '*') {
					res[r][c] = -1;
					for (int k = 0; k < 8; k++) {
						int y = r + d[k][0], x = c + d[k][1];
						if (0 <= y && y < size && 0 <= x && x < size && res[y][x] > -1) res[y][x]++;
					}
				}
			}
		}
		return res;
	}
	
	static void check(int r, int c, int size) {
		ArrayDeque<int[]> ad = new ArrayDeque<>();
		ad.add(new int[] {r, c});
		res[r][c] = -1;
		
		while (!ad.isEmpty()) {
			int[] cur = ad.poll();
			for (int i = 0; i < 8; i++) {
				int y = cur[0] + d[i][0], x = cur[1] + d[i][1];
				if (0 <= y && y < size && 0 <= x && x < size) {
					if (res[y][x] == 0) ad.add(new int[] {y, x});
					res[y][x] = -1;
				}
			}
		}
	}
}