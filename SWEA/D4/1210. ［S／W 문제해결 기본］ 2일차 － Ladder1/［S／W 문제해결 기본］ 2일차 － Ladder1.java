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
		//Scanner sc = new Scanner(System.in);
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int[][] arr = new int[100][100];
        
        for (int i = 0; i < 10; i++) {
        	int tc = Integer.parseInt(br.readLine());
        	
        	int r = 99, c = -1;
        	for (int j = 0; j < 100; j++) {
        		st = new StringTokenizer(br.readLine(), " ");
        		for (int k = 0; k < 100; k++) {
        			arr[j][k] = Integer.parseInt(st.nextToken());
        			if (arr[j][k] == 2) c = k;
        		}
        	}
        	
        	while (r > 0) {
        		if (c > 0 && arr[r][c-1] > 0) {
        			while (c > 0 && arr[r][c-1] > 0) c--;
        		} else if (c < 99 && arr[r][c+1] > 0) {
        			while (c < 99 && arr[r][c+1] > 0) c++;
        		};
        		r--;
        	}
        	
        	sb.append(String.format("#%d %d\n", tc, c));
        }
        
        System.out.println(sb);
        br.close();
	}
}