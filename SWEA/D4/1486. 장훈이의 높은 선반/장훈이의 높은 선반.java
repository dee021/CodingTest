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
        for (int i = 1; i <= tc; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int n = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        	int[] arr = new int[n];
        	
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int j = 0; j < n; j++) arr[j] = Integer.parseInt(st.nextToken());
        	
        	sb.append(String.format("#%d %d\n", i, bf(0, 0, b, arr)));
        }
        
        System.out.println(sb);
        br.close();
    }
	
	static int bf(int idx, int res, int h, int[] arr) {
		if (res >= h) {
			return res - h;
		}
		if (idx >= arr.length) return Integer.MAX_VALUE;
		
		return Math.min(bf(idx +1, res, h, arr), bf(idx +1, res + arr[idx], h, arr));
	}
}