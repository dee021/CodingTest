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
        	int l = Integer.parseInt(st.nextToken()), u = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());
        	
        	sb.append(String.format("#%d ", t));
        	
        	if (l <= x && x <= u) sb.append(0);
        	else if (l > x) sb.append(l - x);
        	else sb.append(-1);
        	
        	sb.append("\n");
        	
        }
        
        System.out.print(sb);
        br.close();
    }
}