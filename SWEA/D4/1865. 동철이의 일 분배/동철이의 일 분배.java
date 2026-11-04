import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
    static double max;
	static boolean[] visited;
	static double[][] arr;
    
	public static void main(String args[]) throws Exception
	{
		
		//System.setIn(new FileInputStream("res/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine());
        for (int t = 1; t <= tc; t++) {
        	int n = Integer.parseInt(br.readLine());
        	visited = new boolean[n];
        	arr = new double[n][n];
        	max = 0;
        	
        	for (int i = 0; i < n; i++) {
        		st = new StringTokenizer(br.readLine(), " ");
        		for (int j = 0; j < n; j++) arr[i][j] = Double.parseDouble(st.nextToken())/100;
        	}
        	
        	dfs(n, 0, 1);
        	max = Math.round(max* 100 * Math.pow(10, 6));
        	max = max * Math.pow(10, -6);
        	
        	sb.append(String.format("#%d %.6f\n", t, max));
        }
        
        System.out.print(sb);
        br.close();
    }
    
    static void dfs(int n, int idx, double res) {
    	if (idx == n) { // end cond
    		if (max < res) max = Math.max(max, res);
    		return ;
    	}
    	
    	for (int p = 0; p < n; p++) {
    		if (!visited[p]) {
    			// prunning
    			if (res * arr[p][idx] <= max) continue;
    			visited[p] = true;
    			dfs(n, idx+1, res * arr[p][idx]);
    			visited[p] = false;
    		}
    	}
    }
}