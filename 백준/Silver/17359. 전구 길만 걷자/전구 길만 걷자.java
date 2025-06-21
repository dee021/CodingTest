import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	static int min = Integer.MAX_VALUE;
	
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), cnt = 0;
        String[] light = new String[n];
        for (int i = 0; i < n; i++) {
        	char[] l = br.readLine().toCharArray();
        	for (int j = 1; j < l.length; j++) {
        		if (l[j-1] != l[j]) cnt++;
        	}
        	light[i] = "" + l[0] + l[l.length-1];
        }
        
        bruteForce(cnt, ' ', light, new boolean[n]);
        
        System.out.println(min);
        br.close();
    }
    
    static void bruteForce(int cnt, char l, String[] light, boolean[] visited) {
    	boolean allVisited = true;
    	
    	for (int i = 0; i < light.length; i++) {
    		if (!visited[i]) {
    			if (allVisited) allVisited = false;
    			visited[i] = true;
    			bruteForce(cnt + (l != ' ' && l != light[i].charAt(0)? 1:0), light[i].charAt(1), light, visited);
    			visited[i] = false;
    		}
    	}
    	
    	if (allVisited) {
    		if (min > cnt) min = cnt;
    		return;
    	}
    }
}