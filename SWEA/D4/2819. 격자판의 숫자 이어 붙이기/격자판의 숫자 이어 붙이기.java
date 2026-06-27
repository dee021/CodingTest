import java.util.Scanner;
import java.io.FileInputStream;

import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.util.Set;
import java.util.HashSet;

class Solution
{
    static int[][] arr = new int[4][4], d = {{0,1},{0,-1}, {1,0}, {-1,0}};
	static Set<Integer> set = new HashSet<>();
    
	public static void main(String args[]) throws Exception
	{
		
		//System.setIn(new FileInputStream("res/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        
        int tc = Integer.parseInt(br.readLine());
        for (int i = 1; i <= tc; i++) {
        	set.clear();
        	for (int r = 0; r < 4; r++) {
        		st = new StringTokenizer(br.readLine(), " ");
        		for (int c = 0; c < 4; c++) arr[r][c] = Integer.parseInt(st.nextToken());
        		}
        	
        	for (int r = 0; r < 4; r++) {
        		for (int c = 0; c < 4; c++) search(r, c);
        	}
        	
        	sb.append(String.format("#%d %d\n", i, set.size()));
        }
        
        System.out.println(sb);
        br.close();
    }
	
	static void search(int r, int c) {
		ArrayDeque<int[]> ad = new ArrayDeque();
		ad.add(new int[] {r, c, arr[r][c], 0});
		
		while (!ad.isEmpty()) {
			int[] cur = ad.poll();
			for (int i = 0; i < 4; i++) {
				int y = cur[0] + d[i][0], x = cur[1] + d[i][1];
				if (0 <= y && y < 4 && 0 <= x && x < 4) {
					if (cur[3] < 5) ad.add(new int[] {y, x, cur[2]*10 + arr[y][x], cur[3] +1});
					else set.add(cur[2]*10 + arr[y][x]);
				}
			}
		}
		
	}
}