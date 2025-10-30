import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        while (n-- > 0) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken());
        	sb.append(Math.min((r-s)*2, (s-l)*2+1)).append("\n");
        }
        
        System.out.println(sb);
        br.close();
    }
}