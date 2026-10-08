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
        
        for (int t = 1; t <= 10; t++) {
        	int[] count = new int[102];
        	int n = Integer.parseInt(br.readLine()), left = 1, right = 100;
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int i = 0; i < 100; i++) {
        		count[Integer.parseInt(st.nextToken())]++;
        	}
        	
        	while (n-- > 0) {
        		while (count[left] < 1) left++;
        		while (count[right] < 1) right--;
        		count[left]--;count[left+1]++;
        		count[right]--;count[right-1]++;
        		
        		if (count[left-1] > 0) left--;
        		if (count[right+1] > 0) right++;
        	}
        	
        	if (count[left] < 1) left++;
    		if (count[right] < 1) right--;
        	
        	sb.append(String.format("#%d %d\n", t, right - left));
        }
        
        System.out.print(sb);
        br.close();
    }
}