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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine());
        
        for (int t = 1; t <= tc; t++) {
        	int n = Integer.parseInt(br.readLine()) -1;
        	
        	st = new StringTokenizer(br.readLine(), " ");
        	int pre = Integer.parseInt(st.nextToken()), up = 0, down = 0;
        	
        	while(n-- > 0) {
        		int cur = Integer.parseInt(st.nextToken());
        		if (pre <= cur) up = Math.max(up, cur - pre);
        		else down = Math.max(down, pre - cur);
        		
        		pre = cur;
        	}
        	
        	sb.append(String.format("#%d %d %d\n", t, up, down));
        }
        
        System.out.print(sb);
        br.close();
    }
}