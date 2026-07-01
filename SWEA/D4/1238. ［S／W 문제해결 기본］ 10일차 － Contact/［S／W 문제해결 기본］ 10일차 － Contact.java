import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
    static Map<Integer, HashSet<Integer>> adj = new HashMap<>();
	static int[] arr;
    
	public static void main(String args[]) throws Exception {
        
		//System.setIn(new FileInputStream("res/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        
        for (int i = 1; i <= 10; i++) {
        	adj.clear();
        	st = new StringTokenizer(br.readLine(), " ");
        	int n = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken()), l = 0, ans = 0;
        	arr = new int[101];
        	
        	st = new StringTokenizer(br.readLine(), " ");
        	while (st.hasMoreTokens()) {
        		int f = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
        		if (adj.containsKey(f)) adj.get(f).add(t);
        		else adj.put(f, new HashSet<>(Arrays.asList(t)));
        	}
        	
        	search(s);
        	
        	for (int j = 1; j <= 100; j++) {
        		if (l <= arr[j]) {
        			l = arr[j];
        			ans = j;
        		}
        	}
        	sb.append(String.format("#%d %d\n", i, ans));
        }
        
        System.out.println(sb);
        br.close();
    }
	
	static void search(int start) {
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.add(start);
		arr[start] = 1;
		
		while (!ad.isEmpty()) {
			int cur = ad.poll();
			
			if (!adj.containsKey(cur)) continue;
			
			for (int post: adj.get(cur)) {
				if (arr[post] < 1) {
					ad.add(post);
					arr[post] = arr[cur]+1;
				}
			}
		}
	}
}