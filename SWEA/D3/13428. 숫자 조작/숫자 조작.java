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
        
        int tc = Integer.parseInt(br.readLine());
        
        for (int t = 1; t <= tc; t++) {
        	String input = br.readLine();
        	int max = Integer.parseInt(input), min = Integer.parseInt(input);
        	
        	for (int i = 0; i < input.length()-1; i++) {
        		for (int j = i +1; j < input.length(); j++) {
        			int tmp = swap(input, i, j);
        			min = Math.min(min, tmp);
        			max = Math.max(max, tmp);
        		}
        	}
            
        	sb.append(String.format("#%d %d %d\n", t, min, max));
        }
        
        System.out.print(sb);
        br.close();
    }
    
    static int swap(String str, int idx1, int idx2) {
    	String res = str.substring(0,idx1) + str.charAt(idx2) + str.substring(idx1+1, idx2) + str.charAt(idx1) + str.substring(idx2+1);
    	if (res.startsWith("0")) return Integer.parseInt(str);
    	return Integer.parseInt(res);
    }
}