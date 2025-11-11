import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
	static int[] depth;
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), root = Integer.parseInt(st.nextToken());
        depth = new int[n+1];
        
        for (int i = 0; i <= n; i++) {
        	depth[i] = -1;
        	graph.add(new ArrayList<>());
        }
        
        while (m-- > 0) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        	graph.get(a).add(b);
        	graph.get(b).add(a);
        }
        
        for (int i = 1; i <= n; i++) Collections.sort(graph.get(i));
        
        System.out.println(bfs(root, n+1));
        br.close();
    }
    
    static long bfs(int root, int size) {
    	Queue<Integer> queue = new LinkedList<>();
    	queue.add(root);
    	depth[root] = 0;
    	
    	long v = 0l, res = 0l;
    	while (!queue.isEmpty()) {
    		int cur = queue.poll();
    		
    		v++;
    		res += v * depth[cur];
    		
    		for (Integer i: graph.get(cur)) {
    			if (depth[i] == -1) {
    				depth[i] = depth[cur]+1;
    				queue.add(i);
    			}
    		}
    	}
    	
    	return res;
    }
    
}