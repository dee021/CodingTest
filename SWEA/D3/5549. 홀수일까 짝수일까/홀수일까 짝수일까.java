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
        	String num = br.readLine();
        	
        	if ((num.charAt(num.length()-1) - '0') % 2 > 0) sb.append(String.format("#%d %s\n", t, "Odd"));
        	else sb.append(String.format("#%d %s\n", t, "Even"));
        }
        
        System.out.println(sb);
        br.close();
    }
}