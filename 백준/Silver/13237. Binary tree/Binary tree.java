import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	static int[][] node;
	
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine()), root = 0;
        node = new int[n+1][3];
        
        for (int i = 1; i <= n; i++) {
        	int p = Integer.parseInt(br.readLine());
        	if (p == -1) root = i;
        	conn(p, i);
        }
        
        getHeight(root, 0);
        
        for (int i = 1; i <= n; i++) sb.append(node[i][2]).append("\n");
        
        System.out.print(sb);
        br.close();
    }
    
    static void conn(int p, int c) {
    	if (p > 0) {
    		if (node[p][0] == 0) node[p][0] = c;
    		else node[p][1] = c;
    	}
    }
    
    static void getHeight(int p, int h) {
    	node[p][2] = h;
    	for (int i = 0; i < 2; i++) {
    		if (node[p][i] > 0) getHeight(node[p][i], h+1);
    	}
    }
}