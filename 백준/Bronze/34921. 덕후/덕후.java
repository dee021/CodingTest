import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int a = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
        int p = 10 + 2 * (25 - a + t);
        
        System.out.println(p >= 0? p: 0);
        br.close();
    }
}