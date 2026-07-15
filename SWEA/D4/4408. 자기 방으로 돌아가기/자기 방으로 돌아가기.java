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
        	int[] arr = new int[201];
        	
        	for (int i = 0; i < n; i++) {
        		st = new StringTokenizer(br.readLine(), " ");
        		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        		if (a % 2 == 0) a--; if (b % 2 == 0) b--;
        		a /= 2; b /= 2;
        		for (int j = Math.min(a, b); j <= Math.max(a, b); j++) {
        			arr[j]++;
        		}
        	}
        	
        	int ans = 0;
        	for (int i = 0; i < 201; i++) ans = Math.max(ans, arr[i]);
        	sb.append(String.format("#%d %d\n", t, ans));
        }
        
        System.out.println(sb);
        br.close();
    }
}