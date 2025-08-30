import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        sol(a, b);

        br.close();
    }
    
    static void sol(int a, int b) {
    	StringBuilder sb = new StringBuilder();
    	
    	for (int i = 1; i <= Math.min(a, b); i++) {
    		if (a % i == 0 && b % i == 0) {
    			sb.append(i + " " + (a/i) + " " + (b/i)).append("\n");
    		}
    	}
    	
    	System.out.print(sb);
    }
}