import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int k = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken()), use = 0, unuse = 0;
        char[] log = br.readLine().toCharArray();
        boolean flash = true;
        ArrayList<Integer> onFlash = new ArrayList<>();
        for (int t = 1; t <= n; t++) {
        	if (log[t-1] == '1') {
        		unuse = 0;
        		use++;
        		if (use >= k && flash) {
        			flash = false;
        		}
        	} else { // log[t-1] = '0'
        		unuse++;
        		use = 0;
        		if (unuse >= l && !flash) {
        			onFlash.add(t);
        			flash = true;
        		}
        	}
        }
        
        if (!flash) {
        	onFlash.add(n+l-unuse);
        }
        
        if (onFlash.isEmpty()) System.out.println("NIKAD");
        else {
        	for (Integer t:onFlash) {
        		sb.append(t).append("\n");
        	}
        	System.out.print(sb);
        }
        br.close();
    }
}
