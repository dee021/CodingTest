import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long n = Long.parseLong(st.nextToken()), m = Long.parseLong(st.nextToken()), res = 0;
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
        	res += Long.parseLong(st.nextToken()) -1;
        	if (res >= m) break;
        }
        
        System.out.println(res >= m? "DIMI": "OUT");
        br.close();
    }  
}