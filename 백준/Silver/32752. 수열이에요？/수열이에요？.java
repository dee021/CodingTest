import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken()), min = 0, max = 0;
        boolean flag = true;
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= n; i++) {
        	int cur = Integer.parseInt(st.nextToken());
        	if (l <= i && i <= r) {
        		if (min > cur) {
        			flag = false;
        			break;
        		}
        		max = Math.max(max, cur);
        	} else if (i < l) {
        		if (cur < min) {
        			flag = false;
        			break;
        		}
        		min = cur;
        	} else { // i > r
        		if (cur < max) {
        			flag = false;
        			break;
        		}
        		max = cur;
        	}
        }
        
        System.out.println(flag? 1 : 0);
        br.close();
    }
}