import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()) %10, _k = k * 2 % 10, cnt = 0, x = 1;
        
        while (x <= n) {
        	if (x % 10 != k && x % 10 != _k) {
        		cnt++;
        		sb.append(x).append(" ");
        	}
        	x++;
        }
        
        System.out.println(cnt);
        System.out.println(sb);
        br.close();
    }
}