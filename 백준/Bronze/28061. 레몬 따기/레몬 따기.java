import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), ans = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= n; i++) {
        	int l = Integer.parseInt(st.nextToken());
        	ans = Math.max(ans, l - Math.min(n+1 - i, l));
        }
        
        System.out.println(ans);
        br.close();
    } 
}