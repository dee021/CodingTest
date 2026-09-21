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
        	String input = br.readLine();
        	int cnt = 0;
        	
        	for (int i = 0; i < input.length(); i++) {
        		if (input.charAt(i) == '(') {
        			cnt++;
        			i++;
        		} else if (input.charAt(i) == ')') cnt++;
        	}
        	
        	sb.append(String.format("#%d %d\n", t, cnt));
        }
        
        System.out.print(sb);
        br.close();
    }
}