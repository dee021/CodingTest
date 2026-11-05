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
        
        for (int t = 1; t <= 10; t++) {
        	br.readLine();
        	String input = br.readLine();
        	int ans = 0;
        	
        	for (char c:input.toCharArray()) {
        		if (c == '+') continue;
        		ans += c - '0';
        	}
        	
        	sb.append(String.format("#%d %d\n", t, ans));
        }
        
        System.out.print(sb);
        br.close();
        
    }
}