import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        if (check(br.readLine() + sb.append(br.readLine()).reverse().toString())) {
        	System.out.println("YES");
        } else System.out.println("NO");
        
        br.close();
    }
    
    static boolean check(String str) {
    	StringBuilder sb = new StringBuilder();
    	boolean flag = false;
    	for (int i = 0; i < 4; i++) {
    		sb.setLength(0);
    		sb.append(str.substring(i)).append(str.substring(0, i));

    		if (sb.toString().equals("HEPC") || sb.reverse().toString().equals("HEPC")) {
    			flag = true;
    			break;
    		}
    	}
    	
    	return flag;
    }
}