import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class Edge implements Comparable<Edge> {
	int v1, v2;
	long dist;
	
	Edge (int v1, int v2, long[] spot1, long[] spot2) {
		this.v1 = v1;
		this.v2 = v2;
		long dx = Math.abs(spot1[0] - spot2[0]), dy = Math.abs(spot1[1] - spot2[1]);
		this.dist = dx*dx + dy*dy;
	}
	
	public long getDist() {return this.dist;}
	public int[] getVertex() {return new int[] {this.v1, this.v2};}

	@Override
	public int compareTo(Edge o) {
		// TODO Auto-generated method stub
		return Long.compare(this.dist, o.getDist());
	}

	@Override
	public String toString() {
		return "Edge [v1=" + v1 + ", v2=" + v2 + ", dist=" + dist + "]";
	}
}

class Solution
{
    static long[][] island = new long[1000][2];
	static PriorityQueue<Edge> pq = new PriorityQueue<>();
    
	public static void main(String args[]) throws Exception
	{
		//System.setIn(new FileInputStream("res/input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine());
        for (int t = 1; t <= tc; t++) {
        	pq.clear();
        	int n = Integer.parseInt(br.readLine());
        	for (int i = 0; i < 2; i++) {
        		st = new StringTokenizer(br.readLine(), " ");
        		for (int j = 0; j < n; j++) island[j][i] = Integer.parseInt(st.nextToken());
        	}
            
        	long res = tunnel(n);
    		double e = Double.parseDouble(br.readLine());
    		sb.append(String.format("#%d %d\n", t, (long)Math.round(res * e)));
        }
        
        System.out.println(sb);
        br.close();
    }
    
    static long tunnel(int n) {
    	boolean visited[] = new boolean[n];
    	visited[0] = true; // start vertex
    	addEdge(n, 0, visited);
    	
    	long totalDist = 0;
    	
    	for (int i = 0; i < n-1; i++) { // round
    		Edge e = pq.poll();
    		while (visited[e.getVertex()[0]] && visited[e.getVertex()[1]]) {
				// 이미 포함된 정점들이므로 버림
				e = pq.poll();
			}
    		if (!visited[e.getVertex()[0]]) {
				visited[e.getVertex()[0]] = true;
				addEdge(n, e.getVertex()[0], visited);
			} else if (!visited[e.getVertex()[1]]) {
				visited[e.getVertex()[1]] = true;
				addEdge(n, e.getVertex()[1], visited);
			} else {
				System.out.println("error");
			}
			totalDist += e.getDist();
		}
    	return totalDist;
    }
    
    static void addEdge(int n, int newV, boolean[] visited) {
    	for (int i = 0; i < n; i++) {
    		if (visited[i]) continue;
    		pq.add(new Edge(i, newV, island[i], island[newV]));
    	}
    }
}