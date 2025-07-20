import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken()), h = 0, c = Integer.MAX_VALUE;
        
        for (int i = 0; i <= t / n; i++) {
        	int tmp = (t - i * n) % m;
        	if (c > tmp) {
        		h = i + (t - i * n) / m;
        		c = tmp;
        	} else if (c == tmp) {
        		h = Math.max(h, i + (t - i * n) / m);
        	}
        }
        
        System.out.println(h + " " + c);
        br.close();
    }
}