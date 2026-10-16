import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    
    static char[][] arr;
	static int r = -1, c = -1, d = -1;
	static int[][] dr = {{-1, 0}, {1, 0}, {0,-1}, {0,1}};
    
	public static void main(String args[]) throws Exception
	{
		
		//System.setIn(new FileInputStream("res/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        
        int tc = Integer.parseInt(br.readLine());
        
        for (int t = 1; t <= tc; t++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int h = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken());
        	arr = new char[h][w];
        	
        	for (int i = 0; i < h ; i++) {
        		String input = br.readLine();
        		for (int j = 0; j < w; j++) {
        			arr[i][j] = input.charAt(j);
        			if ("^v<>".contains(String.valueOf(arr[i][j]))) {
        				d = "^v<>".indexOf(arr[i][j]);
        				r = i;
        				c = j;
        				arr[i][j] = '.';
        			}
        		}
        	}
        	
        	int n = Integer.parseInt(br.readLine());
        	
        	for (char cmd: br.readLine().toCharArray()) {
        		if (cmd != 'S') move(cmd);
        		else shoot();
        	}
        	
        	arr[r][c] = "^v<>".charAt(d);
        	
        	sb.append(String.format("#%d ", t));
        	for (int i = 0; i < h; i++) {
        		for (char a: arr[i]) sb.append(a);
        		sb.append("\n");
        	}
        }
        
        System.out.print(sb);
        br.close();
    }
    
    static boolean check(int r, int c) {
    	if (0 <= r && r < arr.length && 0 <= c && c < arr[0].length) return true;
    	return false;
    }
    
    static void move(char cmd) {
    	d = "UDLR".indexOf(cmd);
    	int rr = r + dr[d][0], cc = c + dr[d][1];
    	if (check(rr, cc) && arr[rr][cc] == '.') {
    		r = rr; c = cc;
    	}
    }
    
    static void shoot() {
    	int rr = r, cc = c;
    	
        while (check(rr + dr[d][0], cc + dr[d][1])) {
    		rr += dr[d][0];
    		cc += dr[d][1];
    		switch(arr[rr][cc]) {
    		case '*': arr[rr][cc] = '.';
    		case '#':  return ;
    		}
    	}
    }
}