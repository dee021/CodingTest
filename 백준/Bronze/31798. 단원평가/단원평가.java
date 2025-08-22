import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken()), ans = 0;
        if (a == 0 || b == 0) ans = Math.min(c*c - a, c*c - b);
        else ans = (int)Math.sqrt(a+b);
        

        System.out.println(ans);
        br.close();
    }
}