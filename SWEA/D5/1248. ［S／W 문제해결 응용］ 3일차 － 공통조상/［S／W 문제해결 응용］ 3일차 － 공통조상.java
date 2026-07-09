import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.util.Scanner;
import java.io.FileInputStream;

class Node{
	int no, parent, c1, c2;
	
	public Node(int no) {
		this.no = no;
		this.parent = 0;
		this.c1 = 0;
		this.c2 = 0;
	}
	
	public void setParent(int p) {
		this.parent = p;
	}
	
	public int getParent() {
		if (this.parent > 0) return this.parent;
		return this.no;
	}
	
	public void setChidren(int c) {
		if (this.c1 < 1) this.c1 = c;
		else this.c2 = c;
	}
	
	public int[] isLeaf() {
		if (this.c1 < 1 && this.c2 < 1) return new int[3];
		if (this.c2 < 1) return new int[] {1, this.c1, 0};
		return new int[] {2, this.c1, this.c2};
	}
}

class Solution
{
    static Node[] node;
    
	public static void main(String args[]) throws Exception
	{
		
		//System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());
        for (int i = 1; i <= tc; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int v = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken()), v1 = Integer.parseInt(st.nextToken()), v2 = Integer.parseInt(st.nextToken());
        	node = new Node[v+1];
        	for (int j = 1; j < v + 1; j++) node[j] = new Node(j);
        	
        	
        	st = new StringTokenizer(br.readLine(), " ");
        	while (e-- > 0) {
        		int p = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
        		node[c].setParent(p);
        		node[p].setChidren(c);
        	}
        	
        	int r = find(v1, v2);
        	
        	sb.append(String.format("#%d %d %d\n", i, r, subSize(r)));
        }
        
        System.out.println(sb);
        br.close();
    }
	
	static int find(int v1, int v2) {
		boolean[] visited = new boolean[node.length];
		visited[v1] = visited[v2] = true;
        
		while (v1 != node[v1].getParent()) {
			v1 = node[v1].getParent();
			if (visited[v1]) return v1;
			visited[v1] = true;
		}
		
		while (v2 != node[v2].getParent()) {
			v2 = node[v2].getParent();
			if (visited[v2]) return v2;
			visited[v2] = true;
		}
		
		return v1;
	}
	
	static int subSize(int v) {
		int[] res = node[v].isLeaf();
		if (res[0] == 0) return 1;
		if (res[2] == 0) return subSize(res[1]) +1;
		return subSize(res[1]) + subSize(res[2]) +1;
	}
}