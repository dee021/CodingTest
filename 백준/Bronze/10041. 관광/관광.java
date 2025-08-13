import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int w = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken()), cnt = 0;
        
        while (n-- > 1) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int nx = Integer.parseInt(st.nextToken()), ny = Integer.parseInt(st.nextToken());
        	cnt += move(x, y, nx, ny);
        	x = nx;y = ny;
        }

        System.out.println(cnt);
        br.close();
    }
    
    static int move(int cx, int cy, int nx, int ny) {
    	int dis = 0, dx = nx - cx, dy = ny - cy;
    	
    	if (dx > 0) {
    		if (dy > 0) {
    			dis = Math.max(dx, dy);
    		} else if (dy == 0) dis = dx;
    		else dis = dx - dy;
    	} else if (dx == 0) dis = Math.abs(dy);
    	else { // dx < 0
    		if (dy < 0) dis = -Math.min(dx, dy);
    		else if (dy == 0) dis = -dx;
    		else dis = -dx +dy;
    	}
    	return dis;
    }
}


