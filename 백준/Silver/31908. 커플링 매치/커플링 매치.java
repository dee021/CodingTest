import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        Map<String, ArrayList<String>> pair = new HashMap<>();
        
        int n = Integer.parseInt(br.readLine()), cnt = 0;
        
        while (n-- > 0) {
        	st = new StringTokenizer(br.readLine(), " ");
        	String name = st.nextToken(), ring = st.nextToken();
        	if (!ring.equals("-")) {
        		if (pair.containsKey(ring)) pair.get(ring).add(name);
        		else pair.put(ring, new ArrayList<String>(Arrays.asList(name)));
        	}
        }
        
        for (String key: pair.keySet()) {
        	if (pair.get(key).size() == 2) {
        		cnt++;
        		sb.append(pair.get(key).get(0) + " " + pair.get(key).get(1)).append("\n");
        	}
        }
        
        System.out.println(cnt);
        if (cnt > 0) System.out.print(sb);
        
        br.close();
    }
}