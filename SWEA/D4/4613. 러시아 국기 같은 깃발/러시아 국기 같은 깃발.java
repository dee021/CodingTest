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
        for (int t = 1; t <= tc; t++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        	int[][] color = new int[n][3];
        	
        	for (int i = 0; i < n; i++) {
        		for (char c: br.readLine().toCharArray()) {
        			if (c == 'W') color[i][0]++;
        			else if (c == 'B') color[i][1]++;
        			else color[i][2]++;
        		}
        	}
        	int total = n*m, max = 0;
        	for (int wb = 1; wb < n-1; wb++) {
        		for (int bR = wb+1; bR < n; bR++) {
        			max = Math.max(max, count(wb, bR, color));
        		}
        	}
        	
        	sb.append(String.format("#%d %d\n", t, total - max));
        }
        System.out.println(sb);
        br.close();
        
    }
	
	static int count(int wb, int br, int[][] color) {
		int c = 0;
		for (int i = 0; i < color.length; i++) {
			if (i < wb) c += color[i][0];
			else if (i < br) c += color[i][1];
			else c += color[i][2];
        }
		return c;
	}
}