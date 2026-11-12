import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;

import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    static ArrayList<Integer>[] al;
    
	public static void main(String args[]) throws Exception
	{
		
		//System.setIn(new FileInputStream("res/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine());
        for (int t = 1; t <= tc; t++) {
        	int k = Integer.parseInt(br.readLine()), n = (int)Math.pow(2, k) -1;
        	int[] arr = new int[n];
        	al = new ArrayList[k];
        	for (int i =0; i < k; i++) al[i] = new ArrayList<>();
        	
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        	
        	read(arr, n, n/2, 0);
        	sb.append(String.format("#%d ", t));
        	for (int lv = 0; lv < k; lv++) {
        		for (int v: al[lv]) sb.append(v).append(" ");
        		sb.append("\n");
        	}
        	
        }
        
        System.out.print(sb);
        br.close();
    }
    
    static void read(int[] arr, int size, int pivot, int lv) {
    	al[lv].add(arr[pivot]);
        if (size > 1) read(arr, size/2, pivot - size/2 + size/2/2, lv +1);
    	if (size > 1) read(arr, size/2, pivot + size/2 - size/2/2, lv +1);
    }
}