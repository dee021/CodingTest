import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        ArrayList<Integer> a, b, c;
        Set<Integer> set;
        
        int tc = Integer.parseInt(br.readLine());
        
        while (tc-- > 0) {
        	
        	a = new ArrayList<>(setAL(Integer.parseInt(br.readLine()), new StringTokenizer(br.readLine(), " ")));
        	b = new ArrayList<>(setAL(Integer.parseInt(br.readLine()), new StringTokenizer(br.readLine(), " ")));
        	c = new ArrayList<>(setAL(Integer.parseInt(br.readLine()), new StringTokenizer(br.readLine(), " ")));
        	
        	set = new HashSet<>();
        	
        	for (int i = 0; i < a.size(); i++) {
        		for (int j = 0; j < b.size(); j++) {
        			nextNum:for (int k = 0; k < c.size(); k++) {
        				String num = a.get(i) + b.get(j) + c.get(k) + "";
        				for (char n: num.toCharArray()) if (n != '5' && n != '8') continue nextNum; 
        				set.add(a.get(i) + b.get(j) + c.get(k));
        			}
        		}
        	}
        	
        	sb.append(set.size()).append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
    
    static Set<Integer> setAL(int m, StringTokenizer st) {
    	Set<Integer> set = new HashSet<>();
    	
    	while (m-- > 0) set.add(Integer.parseInt(st.nextToken()));
    	
    	return set;
    } 
}