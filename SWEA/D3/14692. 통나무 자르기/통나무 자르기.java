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
        
        int tc = Integer.parseInt(br.readLine());
        
        for (int t = 1; t <= tc; t++) {
        	int n = Integer.parseInt(br.readLine()) % 2;
        	
        	if (n > 0) System.out.print(String.format("#%d %s\n", t, "Bob"));
        	else System.out.print(String.format("#%d %s\n", t, "Alice"));
        	
        }
        
        br.close();
    }
}