import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine());
        Set<Integer> s = new HashSet<>();
        
        
        while(tc-- > 0) {
        	int n = Integer.parseInt(br.readLine());
        	s.clear();
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int i = 0; i < n; i++) s.add(Integer.parseInt(st.nextToken()));
        	
        	sb.append(count(n, s)).append("\n");
        }

        System.out.print(sb);
        br.close();
    }
    
    static int count(int n, Set<Integer> s) {
    	int cnt = 0;
    	
    	for (int x:s) {
    		for (int y: s) {
    			if (x >= y) continue;
    			if (s.contains(2*y - x)) cnt++; // x < y
    		}
    	}
    	
    	return cnt;
    }
}