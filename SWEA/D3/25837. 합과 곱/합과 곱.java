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
        	long s = Long.parseLong(st.nextToken()), p = Long.parseLong(st.nextToken());
        	boolean flag = false;
        	
        	for (int f = 1; f <= 1_000_000; f++) {
        		if (f*f > p) break;
        		if (p % f > 0) continue;
        		long x = p/f;
        		if (Long.compare(f+x, s) == 0) {
        			flag = true;
        			break;
        		}
        	}
        	
        	sb.append(flag?"Yes":"No").append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}