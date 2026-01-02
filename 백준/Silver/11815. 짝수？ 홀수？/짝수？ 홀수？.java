import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
        	sb.append(cntFactor(Long.parseLong(st.nextToken()))).append(" ");
        }
        
        System.out.println(sb);
        br.close();
    }
    
    static int cntFactor(Long k) {
    	Long s = (long)Math.sqrt(k);
    	if (k.equals(s*s)) return 1;
    	return 0;
    }
}