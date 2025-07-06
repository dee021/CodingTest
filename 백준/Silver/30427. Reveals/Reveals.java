import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Map<String, Boolean> map = new HashMap<>();
        br.readLine();
        String answer = "";
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
        	map.put(br.readLine(), false);
        }
        
        if (map.containsKey("dongho")) {
        	answer = "dongho";
        } else {
        	
        	int m = Integer.parseInt(br.readLine());
        	for (int i = 0; i < m; i++) map.remove(br.readLine());
        	
        	
        	if (map.size() == 1) {
        		for (String nm:map.keySet()) answer = nm;
        	} else if (map.size() == 0) answer = "swi";
        	else if (map.containsKey("bumin")) answer = "bumin";
        	else if (map.containsKey("cake")) answer = "cake";
        	else if (map.containsKey("lawyer")) answer = "lawyer";
        	else {
        		String[] name = new String[map.size()];
        		int idx = 0;
        		for (String nm:map.keySet()) name[idx++] = nm;
        		Arrays.sort(name);
        		answer = name[0];
        	}
        }
        
        System.out.println(answer);
        br.close();
    }
}