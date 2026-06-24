import java.util.Scanner;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayDeque;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
    static int[][] arr = new int[16][16], d = {{0,1},{0,-1}, {1,0}, {-1,0}};
    
	public static void main(String args[]) throws Exception
	{
		
		//System.setIn(new FileInputStream("res/input.txt"));
		//Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
        	int tc = Integer.parseInt(br.readLine());
        	
        	int r = -1, c = -1;
        	for (int j = 0; j < 16; j++) {
        		String line = br.readLine();
        		for (int k = 0; k < 16; k++) {
        			arr[j][k] = line.charAt(k) - '0';
        			if (arr[j][k] == 2) {
        				r = j;
        				c = k;
        			};
        		}
        	}
        	
        	sb.append(String.format("#%d %d\n", tc, search(r, c)));
        }
        
        System.out.println(sb);
        br.close();
    }
	
	static int search(int r, int c) {
		ArrayDeque<int[]> ad = new ArrayDeque<>();
		ad.add(new int[] {r, c});
		
		
		while (!ad.isEmpty()) {
			int[] cur = ad.poll();
			arr[cur[0]][cur[1]] = 1;
			
			for (int i = 0; i < 4; i++) {
				int y = cur[0] + d[i][0], x = cur[1] + d[i][1];
				if (y >= 0 && y < 16 && x >= 0 && x < 16) {
					if (arr[y][x] == 0) ad.add(new int[] {y, x});
					if (arr[y][x] == 3) return 1;
				}
			}
		}
			
		return 0;
	}
}