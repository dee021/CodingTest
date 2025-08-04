import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int a, b;
        char o;
        while (true) {
        	a = Integer.parseInt(st.nextToken());
        	o = st.nextToken().charAt(0);
        	b = Integer.parseInt(st.nextToken());
        	
        	if (a == 0 && b == 0 && o == 'W') break;
        	
        	if (o == 'W') a -= b;
        	else a += b;
        	if (a < -200) sb.append("Not allowed\n");
        	else sb.append(a).append("\n");
        	
        	st = new StringTokenizer(br.readLine(), " ");
        }
        
        System.out.print(sb);
        
        br.close();
    }
}