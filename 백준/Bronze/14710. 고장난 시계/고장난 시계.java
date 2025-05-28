import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int h = Integer.parseInt(st.nextToken())%30, m = Integer.parseInt(st.nextToken());
        if (h *12 == m) System.out.println("O");
        else System.out.println("X");

        br.close();
    }
}