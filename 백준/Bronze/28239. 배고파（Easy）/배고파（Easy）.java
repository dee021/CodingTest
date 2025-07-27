import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        while (n-- > 0) {
        	long m = Long.parseLong(br.readLine());
        	String bit = Long.toBinaryString(m);
        	sb.append(spot(Long.toBinaryString(m)));
        }
        
        System.out.println(sb);
        br.close();
    }
    
    static String spot(String bit) {
    	int cnt = 0;
    	StringBuilder sb = new StringBuilder();
    	for (int i = bit.length()-1; i > -1; i--) {
    		if (bit.charAt(i) == '1') {
    			cnt++;
    			if (sb.length() > 0) {
    				sb.append(" ").append(bit.length() - i -1);
    				break;
    			} else {
    				sb.append(bit.length() - i -1);
    			}
    		}
    	}
    	if (cnt == 1) {
    		int b = Integer.parseInt(sb.toString()) -1;
    		return b + " " + b + "\n";
    	}
    	return sb.toString() + "\n";
    }
}