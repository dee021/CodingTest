import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
	static long cnt = 0;
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
        
        depth[root] = 0;
        System.out.println(dfs(root));
        br.close();
    }
    
    static long dfs(int vertex) {
    	cnt++;
    	long res = depth[vertex] * cnt;
    	
    	for (Integer i: graph.get(vertex)) {
			if (depth[i] == -1) {
				depth[i] = depth[vertex]+1;
				res += dfs(i);
			}
		}
        
    	return res;
    }
}