import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.util.Set;
import java.util.HashSet;

public class Main {
	static int n;
	static int[][] d = {{0,2}, {0,-2}, {2,0}, {-2,0}};
	static Set<String> dabbaba = new HashSet<>(), visited = new HashSet<>();
	
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < k; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
        	check(x, y);
        }
        
        System.out.println(visited.size());
        br.close();
    }
    
    
    static void check(int x, int y) {
    	if (visited.contains(x + " " + y)) {
    		visited.remove(x + " " + y);
    	}
    	
    	dabbaba.add(x + " " + y);
    	
    	for (int di = 0; di < 4; di++) {
    		int i = x + d[di][0], j = y + d[di][1];
    		if (i <= 0 || i > n || j <= 0 || j > n) continue;
    			
    		if (dabbaba.contains(i + " " + j)) continue;
    		visited.add(i + " " + j);
    	}
    	
    }
}