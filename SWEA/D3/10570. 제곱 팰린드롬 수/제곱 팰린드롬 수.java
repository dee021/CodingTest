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
        
        int[] arr = arrayInit();
        
        int tc = Integer.parseInt(br.readLine());
        
        
        for (int t = 1; t <= tc; t++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        	
        	sb.append(String.format("#%d %d\n", t, arr[b] - arr[a-1]));
        }
        
        System.out.print(sb);
        br.close();
    }
    static int[] arrayInit() {
    	boolean[] arr = new boolean[1001];
    	int[] count = new int[1001];
    	
    	for (int i = 1; i <= 1000; i++) {
    		count[i] += count[i-1];
    		arr[i] = cond(i);
    		double d = Math.sqrt(i);
    		if (Double.compare(d, (int)d) == 0) {
    			if (arr[i] & arr[(int)d]) count[i]++;
    		}
    	}
    	
    	return count;
    }
    
    static boolean cond(int k) {
    	String num = String.valueOf(k);
    	
    	for (int i = 0; i < num.length()/2; i++) {
    		if (num.charAt(i) != num.charAt(num.length() - i -1)) return false;
    	}
    	return true;
    }
    
}