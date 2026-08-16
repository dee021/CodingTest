import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        	int v = Integer.parseInt(br.readLine()), n = v*(v-1)/2;
        	long[] arr = new long[n];
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int i = 0; i < n; i++) arr[i] = Long.parseLong(st.nextToken());
        	
        	long[] ans = mst(v, n, arr);
    		sb.append(String.format("%d %d\n", ans[0], ans[1]));
        }
        
        System.out.println(sb);
        br.close();
    }
    
    static long[] mst(int v, int n, long[] arr) {
    	long min = 0, max = 0;
        int e = 0;
    	Arrays.sort(arr);
    	
    	for (int i = 0; i < v -1; i++) {
    		min += arr[i];
    		max += arr[e];
    		e += i+1;
    	}
    	
    	return new long[] {min, max};
    }
}