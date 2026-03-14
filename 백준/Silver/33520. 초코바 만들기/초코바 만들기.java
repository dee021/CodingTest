import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine()), min = 1, max = 1;
        
        while (n-- > 0) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        	
        	if (a >= b) {
        		max = Math.max(a, max);
        		min = Math.max(b, min);
        	} else {
        		max = Math.max(b, max);
        		min = Math.max(a, min);
        	}
        }
        
        System.out.println((long)min * max);
        br.close();
    }
}