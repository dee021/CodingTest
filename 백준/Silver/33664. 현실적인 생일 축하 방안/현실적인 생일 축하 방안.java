import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Map<String, Long> list = new HashMap<>();
        
        long b = Long.parseLong(st.nextToken());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        
        while (n-- > 0) {
        	st = new StringTokenizer(br.readLine(), " ");
        	list.put(st.nextToken(), Long.parseLong(st.nextToken()));
        }
        
        while (m-- > 0) {
        	b -= list.get(br.readLine());
        }
        
        System.out.println(b < 0? "unacceptable": "acceptable");
        br.close();
    }
}