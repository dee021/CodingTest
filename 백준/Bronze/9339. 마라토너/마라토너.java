import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine()), L = timeConv(6,0);
        Map<Integer, Integer> no = new HashMap<>();
        while (tc-- > 0) {
        	int k = Integer.parseInt(br.readLine()), cnt = 0, spc = -1;
        	no.clear();
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int i = 0; i < k; i++) {
        		no.put(Integer.parseInt(st.nextToken()), null);
        	}
        	
        	int n = Integer.parseInt(br.readLine());
        	for (int i = 0; i < n; i++) {
        		st = new StringTokenizer(br.readLine(), " ");
        		int s = Integer.parseInt(st.nextToken()), 
        				time = timeConv(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        		
        		if (!no.containsKey(s)) continue;
        		
        		no.put(s, time);
        		if (time >= 0 && (spc == -1 || no.get(spc) > time)) spc = s;
        		if (time >= 0 && time <= L) cnt++;
        	}
        	sb.append(spc + " " + cnt).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
    
    static int timeConv(int h, int m) {
    	return h * 60 + m;
    }
}