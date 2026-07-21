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
        
        int testcase = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= testcase; tc++) {
        	int n = Integer.parseInt(br.readLine()), m = Integer.parseInt(br.readLine()), count = 0;
        	boolean[][] adj = new boolean[n][n];
        	
        	while (m-- > 0) {
        		st = new StringTokenizer(br.readLine(), " ");
        		int s = Integer.parseInt(st.nextToken()) -1, t = Integer.parseInt(st.nextToken()) -1;
        		adj[s][t] = true;;
        	}
        	
        	for (int b = 0; b < n; b++) {
        		for (int a = 0; a < n; a++) {
        			for (int c = 0; c < n; c++) {
        				if (adj[a][b] && adj[b][c]) adj[a][c] = true;
        			}
        		}
        	}
        	
        	for (int i = 0; i < n; i++) {
        		boolean flag = true;
        		for (int j = 0; j < n; j++) {
        			if (i == j) continue;
        			if (!(adj[i][j] || adj[j][i])) {
        				flag = false;break;
        			}
        		}
        		if (flag) count++;
        	}
        	sb.append(String.format("#%d %d\n", tc, count));
        }
        
        System.out.println(sb);
        br.close();
    }
}