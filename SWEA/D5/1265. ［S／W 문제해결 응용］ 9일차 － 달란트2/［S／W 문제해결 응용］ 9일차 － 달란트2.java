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
        	int d = Integer.parseInt(st.nextToken()), p =  Integer.parseInt(st.nextToken());
        	long res = 1;
        	
        	while (p > 0) {
        		if (d % p > 0) {
        			res *= (d/p +1);
        			d -= (d/p +1);
        		} else {
        			res *= d/p;
        			d -= d/p;
        		}
        		p--;
        	}
        	
        	sb.append(String.format("#%d %d\n", t, res));
        }
        
        System.out.print(sb);
        br.close();
    }
}