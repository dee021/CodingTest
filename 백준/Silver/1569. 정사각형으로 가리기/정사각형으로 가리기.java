import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()), minX = 1001, maxX = -1001, minY = 1001, maxY = -1001, answer = -1, gap = 0;
        int[][] spot = new int[n][2];
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	spot[i][0] = Integer.parseInt(st.nextToken());
        	spot[i][1] = Integer.parseInt(st.nextToken());
        	
        	minX = Math.min(minX, spot[i][0]);
        	maxX = Math.max(maxX, spot[i][0]);
        	minY = Math.min(minY, spot[i][1]);
        	maxY = Math.max(maxY, spot[i][1]);
        }
        
        if (maxX - minX >= maxY - minY) { 
        	gap = maxX - minX;
        }  else { 
        	gap = maxY - minY;
        }
        
        answer = Math.max(sol(minX, minX+gap, minY, minY+gap, spot, gap), sol(maxX - gap, maxX, maxY - gap, maxY, spot, gap));

        System.out.println(answer);
        br.close();
    }
    
    static int sol(int minX, int maxX, int minY, int maxY, int[][] spot, int gap) {
    	for (int i = 0; i < spot.length; i++) {
    		if (spot[i][0] == minX || spot[i][0] == maxX || spot[i][1] == minY || spot[i][1] == maxY) continue;
    		return -1;
    	}
    	return gap;
    }
}