import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        Map<String, Integer> logs = new HashMap<>();
        Map<Integer, String> revsLogs = new HashMap<>();
        
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
        	String log = br.readLine();
        	logs.put(log, i);
        }
        int k = Integer.parseInt(br.readLine());
        for (int i = n; i < n+k; i++) {
        	String log = br.readLine();
        	logs.put(log, logs.get(log) + 200_000);
        }

        int idx = 0;
        Integer[] order = new Integer[logs.size()];
        for (String key:logs.keySet()) {
        	order[idx] = logs.get(key);
        	revsLogs.put(order[idx++], key);
        }
        
        Arrays.sort(order, Comparator.reverseOrder());

        for (int i = 0; i < order.length; i++) {
        	sb.append(revsLogs.get(order[i])).append("\n");
        }
        
        System.out.println(sb);
        br.close();
    } 
}