import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int h = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        h += Integer.parseInt(st.nextToken());
        y += Integer.parseInt(st.nextToken());
        
        if (h == y) System.out.println("Either");
        else if (h < y) System.out.println("Hanyang Univ.");
        else System.out.println("Yongdap");
        br.close();
    }
}