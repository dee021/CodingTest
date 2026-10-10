import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.ArrayDeque;

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
        	int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), cnt = 0;
        	boolean[][] adj = new boolean[n][n];
        	
        	for (int i = 0; i < m; i++) {
        		st = new StringTokenizer(br.readLine(), " ");
        		int a = Integer.parseInt(st.nextToken())-1, b = Integer.parseInt(st.nextToken())-1;
        		adj[a][b] = adj[b][a] = true;
        	}
        	
        	for (int i = 0; i < n; i++) {
        		cnt = Math.max(cnt, check(adj, i, n));
        	}
        	
        	sb.append(String.format("#%d %d\n", t, cnt));
        }
        
        System.out.print(sb);
        br.close();
    }
    
    static int check(boolean[][] adj, int v, int n) {
    	int cnt = 1;
    	int[] visited = new int [n+1]; 
    	visited[v] = 1;
    	visited[n] = v;
    	
    	ArrayDeque<int[]> ad = new ArrayDeque<>();
    	ad.add(visited);
    	
    	while (!ad.isEmpty()) {
    		visited = ad.poll();
    		v = visited[n];
    		
//    		System.out.println(Arrays.toString(visited));
    		
    		int tmp = 0;
    		
    		for (int i = 0; i < n; i++) {
    			if (adj[v][i] && visited[i] < 1) {
    				visited[i] = 1; visited[n] = i;
    				ad.add(visited.clone());
    				visited[i] = 0; visited[n] = v;
    			}
    			if (visited[i] > 0) tmp++;
    		}
    		cnt = Math.max(cnt, tmp);
    	}
    	
    	return cnt;
    }
}