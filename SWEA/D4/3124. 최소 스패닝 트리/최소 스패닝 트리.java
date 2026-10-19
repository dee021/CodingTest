import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.PriorityQueue;

import java.util.Scanner;
import java.io.FileInputStream;


class DisjointSet {
	private int[] nodes;
	
	DisjointSet (int size) {
		this.nodes = new int[size+1];
		
		for (int i = 1; i <= size; i++) this.nodes[i] = i;
	}
	
	public int find(int node) {
		if (nodes[node] == node) return node;
		nodes[node] = find(nodes[node]);
		return nodes[node];
	}
	
	public boolean union(int node1, int node2) {
		int p1 = find(node1), p2 = find(node2);
		if (p1 == p2) return false;
		nodes[p1] = p2;
		return true;
	}
}


class Solution
{
    
    static PriorityQueue<int[]> pq;
	static DisjointSet ds;
    
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
        	ds = new DisjointSet(n);
        	pq = new PriorityQueue<>((int[] e1, int[] e2) -> e1[2] - e2[2]);
        	
        	while (m-- > 0) {
        		st = new StringTokenizer(br.readLine(), " ");
        		pq.add(new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
        	}
        	
        	long ans = mst(n);
        	sb.append(String.format("#%d %d\n", t, ans));
        	
        }
        System.out.print(sb);
        br.close();
    }
    
    static long mst(int size) {
    	long res = 0, cnt = 0;
    	
    	while (cnt < size -1) {
    		int[] edge = pq.poll();
    		if (ds.union(edge[0], edge[1])) {
    			res += (long)edge[2];
    			cnt++;
    		}
    	}
    	
    	return res;
    }
}