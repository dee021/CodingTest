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
        	int n = Integer.parseInt(br.readLine());
        	int[][] arr = new int[3][n+1];
            
        	for (int i = 0; i < 2; i++) {
        		st = new StringTokenizer(br.readLine(), " ");
        		
        		for (int j = 1; j <= n; j++) {
        			arr[i][j] = Integer.parseInt(st.nextToken());
        		}
        	}
        	
        	int a = 1, b = 1;
        	boolean turnA = true;
        	for (int i = 1; i <= n; i++) {
        		if (turnA) {
        			while (arr[2][arr[0][a]] > 0) {
        				a++;
        			}
        			arr[2][arr[0][a++]] = 1;
        		} else {
        			while (arr[2][arr[1][b]] > 0) {
        				b++;
        			}
        			arr[2][arr[1][b++]] = 2;
        		}
        		turnA ^= true;
        	}
        	
        	for (int i = 1; i <= n; i++) sb.append(arr[2][i] == 1? 'A':'B');
        	sb.append("\n");
        }
        
        System.out.println(sb);
        br.close();
    }
}