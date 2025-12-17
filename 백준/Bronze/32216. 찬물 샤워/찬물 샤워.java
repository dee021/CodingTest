import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken()), ans = 0;
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
        	int d = Integer.parseInt(st.nextToken());
        	
        	if (t < k) {
        		t += d + Math.abs(t-k);
        	} else if (t > k) {
        		t += d - Math.abs(t-k);
        	} else {t += d;}
        	
        	ans += Math.abs(t - k);
        }
        
        System.out.println(ans);
        br.close();
    }
}