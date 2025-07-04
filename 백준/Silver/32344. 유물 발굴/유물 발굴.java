import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int r = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken()), n = Integer.parseInt(br.readLine());
        long[][] size = new long[n+1][4];
        long no = 0, max = 0, tmp;
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int idx = Integer.parseInt(st.nextToken());
        	long y = Long.parseLong(st.nextToken()), x = Long.parseLong(st.nextToken());
        	tmp = calc(size[idx], y, x);
        	if (tmp > max) {
        		no = idx;
        		max = tmp;
        	} else if (!(tmp < max) && idx < no) {
        		no = idx;
        		max = tmp;
        	}
        }
        
        System.out.println(no + " " + max);
        br.close();
    }
    
    static long calc(long[] size, long r, long c) {
    	if (size[0] == 0) {
    		size[0] = r;
    		size[1] = r;
    		size[2] = c;
    		size[3] = c;
    	} else {
    		size[0] = Math.min(size[0], r);
    		size[1] = Math.max(size[1], r);
    		size[2] = Math.min(size[2], c);
    		size[3] = Math.max(size[3], c);
    	}
    	
    	return (size[1] - size[0] + 1) * (size[3] - size[2] + 1);
    }
}