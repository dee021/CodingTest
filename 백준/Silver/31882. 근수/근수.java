import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), t = 0;
        long ans = 0l;
        
        for (char c: br.readLine().toCharArray()) {
        	if (c == '2') t++;
        	else t = 0;
        	
        	if (t > 0) ans += sigma(t);
        }
        
        System.out.println(ans);
        br.close();
    }
    
    static long sigma(int k) {
    	long l = (long) k;
    	
    	return l * (l+1) / 2;
    }
}