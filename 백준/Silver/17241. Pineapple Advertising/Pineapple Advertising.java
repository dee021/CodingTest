import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class Main {
	static boolean[] visited;
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
        visited = new boolean[n+1];
        
        for (int i = 0; i < n+1; i++) graph.add(new ArrayList<>());
        
        while (m-- > 0) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        	graph.get(a).add(b);
        	graph.get(b).add(a);
        }
        
        while (q-- > 0) {
        	sb.append(pineapple(Integer.parseInt(br.readLine()))).append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
    
    static int pineapple(int h) {
    	int cnt = visited[h]? 0: 1;
    	visited[h] = true;
    	
    	for (int i: graph.get(h)) {
    		if (!visited[i]) {
    			visited[i] = true;
    			cnt++;
    		}
    	}
        
        graph.get(h).clear();
    	
    	return cnt;
    }
}