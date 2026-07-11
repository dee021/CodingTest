import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    
    static int[] max = new int[10];
	
	public static void main(String args[]) throws Exception
	{
		
		//System.setIn(new FileInputStream("res/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        max[0] = 1;
        for (int i = 1; i < 10; i++) {
        	max[i] = max[i-1] * i * 2;
        }
        
        // System.out.println(Arrays.toString(max));
        
        int tc = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= tc; i++) {
        	int n = Integer.parseInt(br.readLine());
        	int[] arr = new int[n];
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int j = 0; j < n; j++) arr[j] = Integer.parseInt(st.nextToken());
        	
        	sb.append(String.format("#%d %d\n", i, max[n] - bruteforce(n, 0, 0, 0, arr, new boolean[n])));
        }
        
        System.out.println(sb);
        br.close();
    }
	
	static int bruteforce(int n, int l, int r, int order, int[] arr, boolean[] visited) {
		if (l < r) { 
			return max[n-order];
		}
        if (order >= n) return 0;
		
		int res = 0;
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				res += bruteforce(n, l + arr[i], r, order +1, arr, visited) + bruteforce(n, l, r + arr[i], order +1, arr, visited);
				visited[i] = false;
			}
		}
		return res;
	}
}