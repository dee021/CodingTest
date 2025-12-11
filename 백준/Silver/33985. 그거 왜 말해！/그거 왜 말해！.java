
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println(sol(str)? "Yes": "No");
        
        br.close();
    }
    
    static boolean sol(String str) {
    	int a = 0;
    	
    	for (char c: str.toCharArray()) {
    		if (c == 'A') a++;
    		else if (c == 'B' && a < 1) {
    			return false;
    		} else {
    			while (a > 0) {
    				if (a == 1) break;
    				a--;
    			}
    		}
    	}
    	
    	return a == 1;
    }
}