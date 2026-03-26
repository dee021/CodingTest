import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int p = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(br.readLine()), ans = Math.abs(pmc(p, m, c) - x);
        
        for (int i = 1; i <= p; i++) {
        	for (int j = 1; j <= m; j++) {
        		for (int k = 1; k <= c; k++) ans = Math.min(Math.abs(pmc(i, j, k) - x), ans);
        	}
        }
        
        System.out.println(ans);
        br.close();
        
    }
    
    static int pmc(int p, int m, int c) {
    	return (p + m) * (m + c);
    }
}