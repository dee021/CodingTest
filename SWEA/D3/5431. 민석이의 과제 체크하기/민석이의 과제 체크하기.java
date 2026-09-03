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
        	int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        	boolean[] arr = new boolean[n+1];
        	
        	st = new StringTokenizer(br.readLine(), " ");
        	while (k-- > 0) {
        		arr[Integer.parseInt(st.nextToken())] = true;
        	}
        	
        	sb.append(String.format("#%d ", t));
        	for (int i = 1; i <= n; i++) if (!arr[i]) sb.append(i).append(" ");
        	sb.append("\n");
        	
        }
        
        System.out.println(sb);
        br.close();
    }
}