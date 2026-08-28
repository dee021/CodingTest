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
        	st = new StringTokenizer(br.readLine());
        	int ans = 2;
        	
        	for (int i = 0; i < 3; i++) {
        		int x = Integer.parseInt(st.nextToken()) % 2;
        		if (x == 0) {
        			ans = 1;
        			break;
        		}
        	}
        	
        	sb.append(ans).append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}