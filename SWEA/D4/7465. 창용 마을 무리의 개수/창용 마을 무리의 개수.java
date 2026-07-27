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
    static boolean[] visited;
    
	public static void main(String args[]) throws Exception
	{
		
		//System.setIn(new FileInputStream("res/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine());
        for (int t = 1; t <= tc; t++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), ans = 0;
        	visited = new boolean[n];
        	boolean[][] adj = new boolean[n][n];
        	
        	while(m-- > 0) {
        		st = new StringTokenizer(br.readLine(), " ");
        		int a = Integer.parseInt(st.nextToken()) -1, b = Integer.parseInt(st.nextToken()) -1;
        		adj[a][b] = adj[b][a] = true;
        	}
        	
        	for (int i = 0; i < n; i++) {
        		if (!visited[i]) {
        			ans++;
        			search(adj, i);
        		}
        	}
        	
        	sb.append(String.format("#%d %d\n", t, ans));
        }
        
        System.out.println(sb);
        br.close();
    }
    
    static void search(boolean[][] adj, int node) {
    	ArrayDeque<Integer> ad = new ArrayDeque<>(Arrays.asList(node));
    	visited[node] = true;
    	
    	while (!ad.isEmpty()) {
    		int cur = ad.poll();
    		
    		for (int i = 0; i < adj.length; i++) {
    			if (adj[cur][i] && !visited[i]) {
    				visited[i] = true;
    				ad.add(i);
    			}
    		}
    	}
    }
}