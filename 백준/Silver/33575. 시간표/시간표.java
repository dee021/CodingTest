import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), res = 0;
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
        	int sub = Integer.parseInt(st.nextToken());
        	if (map.containsKey(sub)) map.get(sub).add(i+1);
        	else map.put(sub, new ArrayList<Integer> (Arrays.asList(i+1)));
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < a; i++) {
        	int sub = Integer.parseInt(st.nextToken());
        	if (!map.containsKey(sub)) continue;
        	for (int j:map.get(sub)) {
        		pq.add(j);
        	}
        }
        
        res += calc(pq);
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < b; i++) {
        	int sub = Integer.parseInt(st.nextToken());
        	if (!map.containsKey(sub)) continue;
        	for (int j:map.get(sub)) {
        		pq.add(j);
        	}
        }
        
        res -= calc(pq);
        
        System.out.println(res);
        br.close();
    }
    
    static int calc(PriorityQueue<Integer> pq) {
    	int prev = -1, cur, res = 0, tmp = 0;
    	while (!pq.isEmpty()) {
    		cur = pq.poll();
    		if (cur - prev == 1) {
    			tmp++;
    			if (tmp == 3) res += 3;
    			else if (tmp > 3) res++;
    			
    		}
    		else tmp = 1;
    		prev = cur;
    	}
    	
    	return res;
    }
}