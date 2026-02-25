import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> day = new HashMap<>();
        for (int i = 0; i < 5; i++) {
        	day.put("Mon Tue Wed Thu Fri".split(" ")[i], i);
        }
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int t = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
        
        while (n-- > 0) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int t1 = 24 * day.get(st.nextToken()) + Integer.parseInt(st.nextToken());
        	int t2 = 24 * day.get(st.nextToken()) + Integer.parseInt(st.nextToken());
        	t -= t2 - t1;
        }
        
        if (t <= 48) System.out.println(t > 0? t: 0);
        else System.out.println(-1);
        br.close();
    }
}