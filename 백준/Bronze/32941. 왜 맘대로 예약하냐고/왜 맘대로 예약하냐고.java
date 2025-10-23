import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int t = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine()), cnt = 0;
        
        for (int i = 0; i < n; i++) {
        	int j = Integer.parseInt(br.readLine());
        	st = new StringTokenizer(br.readLine(), " ");
        	while (j-- > 0) if (Integer.parseInt(st.nextToken()) == x) {
        		cnt++;
        		break;
        	}
        }

        System.out.println(n == cnt? "YES": "NO");
        br.close();
    }
}
