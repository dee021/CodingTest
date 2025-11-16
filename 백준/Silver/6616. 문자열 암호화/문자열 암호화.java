import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder(), text = new StringBuilder();
        
        while (true) {
        	int n = Integer.parseInt(br.readLine());
        	if (n < 1) break;
        	
        	st = new StringTokenizer(br.readLine(), " ");
        	text.setLength(0);
        	
        	while (st.hasMoreTokens()) text.append(st.nextToken().toUpperCase());
        	
        	sb.append(cipher(n, text.toString().toCharArray()));
        	sb.append("\n");
        }
        
		System.out.print(sb);
        br.close();
    }
    
    static String cipher(int n, char[] text) {
    	StringBuilder sb = new StringBuilder();
    	char[] cypher = new char[text.length];
    	int idx = 0;
    	
    	for (int start = 0; start < n; start++) {
    		for (int c = start; c < text.length; c += n) {
    			cypher[c] = text[idx++];
    		}
    	}
    	
    	for (char c: cypher) {
    		sb.append(c);
    	}
    	
    	return sb.toString();
    }
}