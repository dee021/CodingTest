import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayDeque;

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
        
        ArrayDeque<Character> ad;
        
        for (int t = 1; t <= 10; t++) {
        	ad = new ArrayDeque<>();
        	st = new StringTokenizer(br.readLine(), " ");
        	
        	int n = Integer.parseInt(st.nextToken());
        	char[] arr = st.nextToken().toCharArray();
        	
        	for (int i = 0; i < n; i++) {
        		if (!ad.isEmpty() && arr[i] == ad.peekLast()) {
        			ad.pollLast();
        		} else ad.add(arr[i]);
        	}
        	
        	sb.append(String.format("#%d ", t));
        	while (!ad.isEmpty()) sb.append(ad.poll());
        	sb.append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}