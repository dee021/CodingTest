import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayDeque;

import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
    static int[][] arr, d = {{0,1},{0,-1}, {1,0}, {-1,0}};
    
	public static void main(String args[]) throws Exception
	{
		
		//System.setIn(new FileInputStream("res/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int sr = 0, sc = 0;

        for (int i = 1; i <= 10; i++) {
        	int tc = Integer.parseInt(br.readLine());
        	arr = new int[100][100];
        	
        	for (int j = 0; j < 100; j++) {
        		String line = br.readLine();
        		for (int k = 0; k < 100; k++) {
        			arr[j][k] = line.charAt(k) - '0';
        			if (arr[j][k] == 2) {
        				sr = j;
        				sc = k;
        			} 
        		}
        	}
        	
        	sb.append(String.format("#%d %d\n", tc, ans(sr, sc)));
        }
        
        System.out.println(sb);
        br.close();
    }
	
	static int ans(int sr, int sc) {
		ArrayDeque<int[]> ad = new ArrayDeque<>();
		ad.add(new int[] {sr, sc});
		
		while (!ad.isEmpty()) {
			int[] cur = ad.poll();
			
			for (int i = 0; i < 4; i++) {
				int x = cur[0] + d[i][0], y = cur[1] + d[i][1];
				
				if (x < 0 || x >= 100 || y < 0 || y >= 100) continue;
				
				if (arr[x][y] == 0) {
					arr[x][y] = 1;
					ad.add(new int[] {x, y});
				} else if (arr[x][y] == 3) return 1;
			}
		}
		return 0;
	}
}