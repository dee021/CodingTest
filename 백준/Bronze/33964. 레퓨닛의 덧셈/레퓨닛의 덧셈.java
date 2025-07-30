import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken()), res = 0;

        for (int i = 1; i <= Math.max(x, y); i++) {
        	res *= 10;
        	res++;
        	if (i > Math.max(x, y) - Math.min(x, y)) res++;
        }
        
        System.out.println(res);
        br.close();
    }
}