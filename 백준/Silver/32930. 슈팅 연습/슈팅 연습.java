import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), score = 0, y = 0, x = 0;
        int[][] spot = new int[n][2];
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	spot[i][0] = Integer.parseInt(st.nextToken());
        	spot[i][1] = Integer.parseInt(st.nextToken());
        }
        
        while (m-- > 0) {
        	int dis = 0, idx = -1;
        	
        	for (int i = 0; i < n; i++) {
        		int d = getDis(spot[i], x, y);
        		if (d > dis) {
        			dis = d; idx = i;
        		}
        	}
        	
        	score += dis;
        	x = spot[idx][0];
        	y = spot[idx][1];
        	
        	st = new StringTokenizer(br.readLine(), " ");
        	spot[idx][0] = Integer.parseInt(st.nextToken());
        	spot[idx][1] = Integer.parseInt(st.nextToken());
        }
        
        System.out.println(score);
        br.close();
    }
	
	static int getDis(int[] s, int x, int y) {
		int dx = Math.abs(s[0] - x), dy = Math.abs(s[1] - y);
		return dx*dx + dy*dy;
	}
}