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
        	int n = Integer.parseInt(br.readLine()), ans = -1;
        	int[] arr = new int[n];
        	st = new StringTokenizer(br.readLine(), " ");
        	
        	for (int i = 0; i < n; i++) {
        		arr[i] = Integer.parseInt(st.nextToken());
        	}
        	
        	for (int i = 0; i < n-1; i++) {
        		for (int j = i+1; j < n; j++) {
        			ans = Math.max(ans, check(arr[i]*arr[j]));
        		}
        	}
        	
        	sb.append(String.format("#%d %d\n", t, ans));
        }
        
        System.out.print(sb);
        br.close();
    }
    
    static int check(int num) {
    	int tmp = num, t = tmp % 10;;
    	while (tmp > 0) {
    		tmp /= 10;
    		if (t < tmp%10) return -1;
            t = tmp % 10;
    	}
    	return num;
    }
}