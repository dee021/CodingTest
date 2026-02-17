import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine())-1, ans = 1;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        long k = Long.parseLong(st.nextToken());
        
        while (n-- > 0 && ans > 0) {
        	long a = Long.parseLong(st.nextToken());
        	if (Long.compare(k, a) >= 0) ans = 0;
        	k = a;
        }
        
        System.out.println(ans);
        br.close();
    }
}