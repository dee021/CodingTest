import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        long luck = 0L;
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) luck += Long.parseLong(st.nextToken());
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
        	long t = Long.parseLong(st.nextToken());
        	if (t > 0) luck *= t;
        }
        
        System.out.println(luck);
        br.close();
    }
}