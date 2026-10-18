import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
    static PriorityQueue<Integer> pq;
	static Set<Integer> set;
    
	public static void main(String args[]) throws Exception
	{
		
		//System.setIn(new FileInputStream("res/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine());
        int[] arr = new int[7];
        
        for (int t = 1; t <= tc; t++) {
        	pq = new PriorityQueue<>(Collections.reverseOrder());
        	set = new HashSet<>();
        	
        	st = new StringTokenizer(br.readLine(), " ");
        	
        	for (int i = 0; i < 7; i++) {
        		arr[i] = Integer.parseInt(st.nextToken());
        	}
        	
        	bruteForce(arr, 0, 0, 0);
        	for (int i = 0; i < 4; i++) pq.poll();
        	
        	sb.append(String.format("#%d %d\n", t, pq.peek()));
        }
        
        System.out.print(sb);
        br.close();
    }
    
    
    static void bruteForce(int[] arr, int dep, int idx, int res) {
    	if (dep >= 3) {
    		if (!set.contains(res)) {
    			pq.add(res);
    			set.add(res);
    		}
    		return ;
    	}
    	if (idx >= 7) return;
    	
    	bruteForce(arr, dep, idx+1, res);
    	bruteForce(arr, dep+1, idx+1, res + arr[idx]);
    }
}