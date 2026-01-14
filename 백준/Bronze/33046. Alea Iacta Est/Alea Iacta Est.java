import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int s = (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) % 4;
        if (s == 0) s = 4;
        st = new StringTokenizer(br.readLine(), " ");
        int t = (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) -1) % 4;
        s = (s + t) % 4;
        
        if (s == 0) s = 4;
        
        System.out.println(s);
        br.close();
    }
}