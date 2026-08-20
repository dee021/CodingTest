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
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine());
        for (int t = 1; t <= tc; t++) {
        	String input = br.readLine();
        	boolean[] dir = new boolean[26];
        	boolean ans = true;
        	
        	for (char c:input.toCharArray()) dir[c-'A'] = true;;
        	
        	if (dir['E'-'A'] ^ dir['W'-'A'] || dir['S'-'A'] ^ dir['N'-'A']) ans = false;
        	
    		sb.append(ans?"Yes\n":"No\n");
        }
        
        System.out.println(sb);
        br.close();
    }
}