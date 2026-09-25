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
        	int k = Integer.parseInt(br.readLine()), ans = 0;
        	int[] tree = new int[2 << k];
        	
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int i = 2 << (k-1); i < 2 << k; i++) {
        		tree[i] = Integer.parseInt(st.nextToken());
        	}
        	
        	while (k > 0) {
        		for (int i = 2 << (k-1); i < 2 << k; i += 2) {
        			tree[i/2] = Math.max(tree[i], tree[i+1]);
        			ans += Math.abs(tree[i] - tree[i+1]);
        		}
        		k--;
        	}
        	
        	sb.append(String.format("#%d %d\n", t, ans));
        }
        
        System.out.print(sb);
        br.close();
    }
    
}