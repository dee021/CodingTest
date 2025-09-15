import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken()), ans = -1;
        
        while (n-- > 0) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int s = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
        	
        	if (s + t > x) continue;
        	if (s > ans) ans = s;
        }
        
        System.out.println(ans);
        br.close();
    }
}