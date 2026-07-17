import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
    static int[][] adj;
    
	public static void main(String args[]) throws Exception
	{
		
		//System.setIn(new FileInputStream("res/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine()), INF = 1_000_000;
        for (int t = 1; t <= tc; t++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int n = Integer.parseInt(st.nextToken()), ans = INF;
        	adj = new int[n][n];
        	
        	for (int i = 0; i < n; i++) {
        		for (int j = 0; j < n; j++) {
        			adj[i][j] = Integer.parseInt(st.nextToken());
        			if (adj[i][j] == 0 && i != j)adj[i][j] = INF;
        		}
        	}
        	
        	floydWarshall(n);
        	
        	for (int i = 0; i < n; i++) {
        		int s = 0;
        		for (int j = 0; j < n; j++) s += adj[i][j];
        		ans = Math.min(ans, s);
        	}
        	sb.append(String.format("#%d %d\n", t, ans));
        	
        }
        
        System.out.println(sb);
        br.close();
    }
	
	static void floydWarshall(int n) {
		for (int m = 0; m < n; m++) {
			for (int s = 0; s < n; s++) {
				for (int e = 0; e < n; e++) {
					if (adj[s][e] > adj[s][m] + adj[m][e]) {
						adj[s][e] = adj[s][m] + adj[m][e];
					}
				}
			}
		}
	}
}