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
        	int min = 100, max = 0;
        	
        	for (int i = 0; i < 10; i++) {
        		String nums = st.nextToken();
        		int cur = 0;
        		
        		for (char c: nums.toCharArray()) cur += c - '0';
        		min = Math.min(min, cur);
        		max = Math.max(max, cur);
        	}
            
        	sb.append(String.format("#%d %d %d\n", t, max, min));
        }
        
        System.out.print(sb);
        br.close();
    }
}