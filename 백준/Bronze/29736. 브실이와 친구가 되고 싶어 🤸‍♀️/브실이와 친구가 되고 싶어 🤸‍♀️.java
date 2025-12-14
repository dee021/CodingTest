import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int k = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());
        
        int ans = Math.min(b, k + x) - Math.max(a, k - x) +1;
        
        System.out.println(ans > 0? ans: "IMPOSSIBLE");
        br.close();
    }
}
