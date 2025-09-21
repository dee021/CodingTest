import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> card = new HashMap<>();
        int n = Integer.parseInt(br.readLine()), ans = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= n; i++) {
        	String c = st.nextToken();
        	if (!card.containsKey(c)) card.put(c, 0);
        	card.put(c, card.get(c)+1);
        	
        	if (card.get(c) >= 5) {
        		ans = i;
        		break;
        	}
        }
        
        System.out.println(ans);
        br.close();
    }
}