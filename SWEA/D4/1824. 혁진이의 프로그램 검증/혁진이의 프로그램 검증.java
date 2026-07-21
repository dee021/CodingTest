import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayDeque;

import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	static int[][] d = {{0,1},{0,-1}, {1,0}, {-1,0}};
    
	public static void main(String args[]) throws Exception
	{
		
		//System.setIn(new FileInputStream("res/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine());
        for (int t = 1; t <= tc; t++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int r = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
        	boolean ans = false;
        	char[][] cmd = new char[r][];
        	
        	for (int i = 0; i < r; i++) {
        		String input = br.readLine();
        		if (input.contains("@")) ans = true;
        		cmd[i] = input.toCharArray();
        	}
        	
        	if (ans) ans = exec(r, c, cmd);
        	sb.append(String.format("#%d %s\n", t, ans? "YES": "NO"));
        }
        
        System.out.println(sb);
        br.close();
    }
	
	static boolean exec(int r, int c, char[][] cmd) {
		ArrayDeque<int[]> ad = new ArrayDeque<>();
		ad.add(new int[4]);
		
		boolean[][][][] visited = new boolean[r][c][4][16];
		
		while (!ad.isEmpty()) {
			int[] cur = ad.poll();
			int y = cur[0], x = cur[1], dir = cur[2], mem = cur[3];
			while (!visited[y][x][dir][mem]) {
				visited[y][x][dir][mem] = true;
				if (cmd[y][x] >= '0' && cmd[y][x] <= '9') mem = cmd[y][x] - '0';
				else if (cmd[y][x] == '+') mem = ++mem > 15? 0: mem;
				else if (cmd[y][x] == '-') mem = --mem < 0? 15: mem;
				else if (cmd[y][x] == '@') return true;
				else if (cmd[y][x] == '?') {
				
					for (int i = 0; i < 4; i++) {
						int yy = y + d[i][0], xx = x + d[i][1];
						if (yy < 0 || yy >= r) yy = (yy + r) % r;
						if (xx < 0 || xx >= c) xx = (xx + c) % c;
						ad.add(new int[] {yy, xx, i, mem});
					}
				}
				else if (cmd[y][x] == '<') dir = 1;
				else if (cmd[y][x] == '>') dir = 0;
				else if (cmd[y][x] == '^') dir = 3;
				else if (cmd[y][x] == 'v') dir = 2;
				else if (cmd[y][x] == '_') dir = mem == 0? 0:1;
				else if (cmd[y][x] == '|') dir = mem == 0? 2:3;
			
				y += d[dir][0]; x += d[dir][1];
				if (y < 0 || y >= r) y = (y + r) % r;
				if (x < 0 || x >= c) x = (x + c) % c;
			}
		}
		return false;
	}
}