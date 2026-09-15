import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

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
        int[] arr = new int[3];
        
        for (int t = 1; t <= tc; t++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int i = 0; i < 3; i++) arr[i] = Integer.parseInt(st.nextToken());
        	Arrays.sort(arr);
        	
        	sb.append(String.format("#%d %d\n", t, arr[0] == arr[1]? arr[2]: arr[0]));
        }
        
        System.out.print(sb);
        br.close();
    }
}