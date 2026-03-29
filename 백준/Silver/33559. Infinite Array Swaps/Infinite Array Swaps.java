import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(), b = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine()), cnt = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for (int i = 0; i < n; i++) {
        	int key = Integer.parseInt(st.nextToken());
        	map.put(key, map.getOrDefault(key, 0)+1);
        }
        
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        
        for (int i = 0; i < n; i++) {
        	int key = Integer.parseInt(st.nextToken());
        	if (map.containsKey(key)) {
        		cnt++;
        		a[i] = key;
        		if (map.get(key) > 1) map.put(key, map.get(key) - 1);
        		else map.remove(key);
        	}
        	b.append(key).append(" ");
        }
        
        sb.append(cnt).append("\n");
        
        int idx = 0;
        for (int key:map.keySet()) {
        	while (map.get(key) > 0) {
        		if (a[idx] > 0) sb.append(a[idx]).append(" ");
        		else {
        			sb.append(key).append(" ");
        			map.put(key, map.get(key)-1);
        		}
        		idx++;
        	}
        }
        
        for (int i = idx; i < n; i++) {
        	if (a[i] > 0) sb.append(a[i]).append(" ");
        }
        
        System.out.println(sb);
        System.out.println(b);
        br.close();
    }
}