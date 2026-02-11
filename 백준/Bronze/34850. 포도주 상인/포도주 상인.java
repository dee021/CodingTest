import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken()), p = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        long m = (p + (y-1) * b) * x, n = x > 1? (x-1) * x / 2 * a:0;
        
        System.out.println(m - n);
        
        br.close();
    }
}