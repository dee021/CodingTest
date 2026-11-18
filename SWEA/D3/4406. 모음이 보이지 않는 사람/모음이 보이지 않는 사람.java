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
        	sb.append(String.format("#%d ", t));
        	
        	String input = br.readLine();
        	for (char c: input.toCharArray()) {
        		switch(c) {
        		case 'a':case 'e':case 'i':case 'o':case 'u': continue;
        		default: sb.append(c);
        		}
        	}
        	
        	sb.append("\n");
        }
        
        System.out.print(sb);
        br.close();
        
    }
}