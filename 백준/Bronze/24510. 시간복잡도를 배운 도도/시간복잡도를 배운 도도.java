import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), max = 0;
        
        while (n-- > 0) {
        	String code = br.readLine();
        	int cur = 0, len = code.length();
        	
        	code = code.replace("for", "");
        	cur += (len - code.length())/3;
        	len = code.length();
        	
        	code = code.replace("while", "");
        	cur += (len - code.length())/5;
        	
        	max = Math.max(max, cur);
        }
        
        System.out.println(max);
        br.close();
    }
}