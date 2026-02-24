import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int bus = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()), walk = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
        String ans = "T.T";
        
        if (bus <= t && walk <= t) ans = "~.~";
        else if (bus <= t) ans = "Shuttle";
        else if (walk <= t) ans = "Walk";
        
        System.out.println(ans);
        br.close();
    }
}