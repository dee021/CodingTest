import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine());
        
        while (tc-- > 0) {
        	String input = br.readLine();
        	sb.append(sol((int)Math.sqrt(input.length()), input)).append("\n");
        }
        
        System.out.println(sb);
        br.close();
    }
    
    
    static String sol(int n, String str) {
    	StringBuilder sb = new StringBuilder();
    	
    	for (int i = 1; i < n+1; i++) {
    		for (int j = 0; j < n; j++)
    			sb.append(str.charAt(n*(j+1) - i));
    	}
    	
    	return sb.toString();
    }
}