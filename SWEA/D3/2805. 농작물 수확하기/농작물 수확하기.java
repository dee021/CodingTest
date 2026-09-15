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
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine());
        
        for (int t = 1; t <= tc; t++) {
        	int n = Integer.parseInt(br.readLine()), p = n/2, min = p, max = p, ans = 0;
        	
        	for (int i = 0; i < n; i++) {
        		String input = br.readLine();
        		for (int j = min; j <= max; j++) {
        			ans += input.charAt(j) - '0';
        		}
        		if (i < p) {
    				min--;max++;
    			} else {
    				min++;max--;
    			}
        	}
        	
        	sb.append(String.format("#%d %d\n", t, ans));
        }
        
        System.out.print(sb);
        br.close();
    }
}