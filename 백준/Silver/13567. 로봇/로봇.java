import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken()), d = 0, y = 0, x = 0;
        int[][] dr = {{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
        boolean flag = true;
        
        while (n-- > 0) {
        	st = new StringTokenizer(br.readLine(), " ");
        	if (st.nextToken().equals("MOVE")) {
        		int dis = Integer.parseInt(st.nextToken()), yy = y + dr[d][0] * dis, xx = x + dr[d][1] * dis;
        		if (0 <= yy && yy <= m && 0 <= xx && xx <= m) {
        			y = yy; x = xx;
        		} else {
        			flag = false;
        			break;
        		}
        	} else { // turn
        		if (st.nextToken().equals("1")) d = (d+1) % 4;
        		else d = (d + 3) % 4;
        	}
        }
        
        if (flag) System.out.println(x + " " + y);
        else System.out.println(-1);
        
        br.close();
    }
}