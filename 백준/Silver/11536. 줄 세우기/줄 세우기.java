import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        boolean asc = true, desc = true;
        
        String pre = br.readLine();
        
        while (n-- > 1) {
        	String cur = br.readLine();
        	if (pre.compareTo(cur) < 0) {
        		desc = false;
        	} else if (pre.compareTo(cur) > 0) {
        		asc = false;
        	}
            pre = cur;
        }
        
        
        if (asc || desc) {
        	System.out.println(asc? "INCREASING": "DECREASING");
        } else System.out.println("NEITHER");
        
        br.close();
    }
}