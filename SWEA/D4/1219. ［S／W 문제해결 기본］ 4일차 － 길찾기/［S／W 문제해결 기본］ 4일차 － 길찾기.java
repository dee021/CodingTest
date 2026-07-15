import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayDeque;

import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		//System.setIn(new FileInputStream("res/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        
        for (int t = 1; t <= 10; t++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int tc = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
        	int[][] arr = new int[101][2];
        	
        	st = new StringTokenizer(br.readLine(), " ");
        	while (n-- > 0) {
        		int s = Integer.parseInt(st.nextToken())+1, e = Integer.parseInt(st.nextToken())+1;
        		if (arr[s][0] > 0) arr[s][1] = e;
        		else arr[s][0] = e;
        	}
        	
        	int ans = bfs(arr)? 1: 0;
        	sb.append(String.format("#%d %d\n", tc, ans));
        	
        }
        
        System.out.println(sb);
        br.close();
    }
	
	static boolean bfs(int[][] arr) {
		boolean[] visited = new boolean[101];
		visited[0] = visited[1] = true;
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.add(1);
		
		while (!ad.isEmpty()) {
			int cur = ad.poll();
			
			for (int i = 0; i < 2; i++) {
				if (arr[cur][i] == 100) return true;
				if (!visited[arr[cur][i]]) {
					ad.add(arr[cur][i]);
					visited[arr[cur][i]] = true;
				}
			}
		}
		return false;
	}
}