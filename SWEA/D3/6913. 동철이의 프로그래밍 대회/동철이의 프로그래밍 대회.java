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
        	int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), p = 0, cnt = 0;
        	int[] arr = new int[n+1];
        	
        	for (int i = 1; i < n+1; i++) {
        		st = new StringTokenizer(br.readLine(), " ");
        		for (int j = 0; j < m; j++) {
        			if (Integer.parseInt(st.nextToken()) > 0) arr[i]++;
        		}
        		
        		if (arr[i] > cnt) {
        			cnt = arr[i];
        			p = 1;
        		} else if (arr[i] == cnt) p++;
        	}
        	
        	sb.append(String.format("#%d %d %d\n", t, p, cnt));
        }
        
        System.out.print(sb);
        br.close();
    }
}