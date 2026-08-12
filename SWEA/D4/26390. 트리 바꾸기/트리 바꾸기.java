import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        	int n = Integer.parseInt(br.readLine()), ans = 0;
        	int[] edge = new int[n+1];
        	
        	for (int i = 0; i < n-1; i++) {
        		st = new StringTokenizer(br.readLine(), " ");
        		for (int j = 0; j < 2; j++) edge[Integer.parseInt(st.nextToken())]++;
        	}
        	
        	for (int i = 1; i < n+1; i++) if (edge[i] > 2) ans += edge[i] - 2;
        	
    		sb.append(ans).append("\n");
        }
        
        System.out.println(sb);
        br.close();
    }
}