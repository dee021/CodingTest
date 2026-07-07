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

        
        for (int i = 1; i <= 10; i++) {
        	int n = Integer.parseInt(br.readLine());
        	int ans = 1;
        	
        	for (int j = 0; j < n; j++) {
        		String[] node = br.readLine().split(" ");
        		if (!validate(node)) ans = 0;
        	}
        	
        	sb.append(String.format("#%d %d\n", i, ans));
        }
        
        System.out.println(sb);
        br.close();
    }
	
	static boolean validate(String[] node) {
		char o = node[1].charAt(0);
		if (node.length == 2) {
			if (o >= '0' && o <= '9') return true;
			return false;
		}
		if (o >= '0' && o <= '9') return false;
		return true;
	}
}