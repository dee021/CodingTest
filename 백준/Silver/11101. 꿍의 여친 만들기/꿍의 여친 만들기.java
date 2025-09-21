import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Map;
import java.util.HashMap;

public class Main {
	static Map<String, Integer> condition;
	
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine());
        
        while (tc-- > 0) {
        	setCond(br.readLine().split(","));
        	sb.append(getMinTime(br.readLine().split("[^a-z&]"))).append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
    
    static void setCond(String[] conds) {
    	condition = new HashMap<>();
    	
    	for (String cond:conds) {
    		String[] c = cond.split(":");
    		condition.put(c[0], Integer.parseInt(c[1]));
    	}
    }
    
    static int getMinTime(String[] conds) {
    	int min = Integer.MAX_VALUE, cur;
    	
    	for (String cond:conds) {
    		String[] cs = cond.split("&");
    		cur = 0;
    		for (String c:cs) {
    			cur = Math.max(cur, condition.get(c));
    		}
    		min = Math.min(min, cur);
    	}
    	return min;
    }
}