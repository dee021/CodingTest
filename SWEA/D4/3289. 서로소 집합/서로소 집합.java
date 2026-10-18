import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
    static int[] arr = new int[1_000_001];
    
	public static void main(String args[]) throws Exception
	{
		
		//System.setIn(new FileInputStream("res/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine());
        
        for (int t = 1; t <= tc; t++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        	initArr(n);
        	
        	sb.append(String.format("#%d ", t));
        	
        	while (m-- > 0) {
        		st = new StringTokenizer(br.readLine(), " ");
        		if (Integer.parseInt(st.nextToken()) == 0) union(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        		else sb.append(check(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        	}
        	
        	sb.append("\n");
        	
        }
        System.out.print(sb);
        br.close();
    }
    
    static void initArr(int size) {
    	for (int i = 1; i <= size; i++) arr[i] = i;
    }
    
    static void union(int node1, int node2) {
    	int p1 = find(node1), p2 = find(node2);
    	arr[p1] = p2;
    }
    
    static int find(int node) {
    	if (arr[node] == node) return node;
    	arr[node] = find(arr[node]);
    	return arr[node];
    }
    
    static int check(int node1, int node2) {
    	int p1 = find(node1), p2 = find(node2);
    	if (p1 == p2) return 1;
    	return 0;
    }
}