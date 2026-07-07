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
        for (int i = 1; i <= tc; i++) {
        	int n = Integer.parseInt(br.readLine());
        	int[][] arr = new int[n][];
        	
        	st = new StringTokenizer(br.readLine(), " ");
        	int[] start = new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())},
        			end = new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        	
        	for (int j = 0; j < n; j++) {
        		arr[j] = new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        	}
        	
        	sb.append(String.format("#%d %d\n", i, dfs(start, end, arr, 0, "")));
        }
        
        System.out.println(sb);
        br.close();
    }
	
	static int dfs(int[] cur, int[] end, int[][] arr, int res, String visited) {
		if (visited.length() == arr.length) {
			return res + dist(cur, end);
		}
		
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (visited.indexOf(String.valueOf(i)) > -1) continue;
			int tmp = dfs(arr[i], end, arr, res + dist(cur, arr[i]), visited + i);
			min = Math.min(min, tmp);
		}
        
		return min;
	}
	
	static int dist(int[] from, int[] to) {
		int dx = Math.abs(from[0] - to[0]), dy = Math.abs(from[1] - to[1]);
		return dx + dy;
	}
}