import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), left = Integer.MAX_VALUE, right = Integer.MAX_VALUE;
        boolean pass = false;
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
        	int p = Integer.parseInt(st.nextToken());
        	
        	if (p == -1) {
        		pass = true;
        		continue;
        	}
        	
        	if (pass) right = Math.min(right, p);
        	else left = Math.min(left, p);
        }
        
        System.out.println(left + right);
        
        br.close();
    }
}