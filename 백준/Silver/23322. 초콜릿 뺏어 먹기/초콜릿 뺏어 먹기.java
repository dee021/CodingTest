import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine(), " ");
        int min = Integer.parseInt(st.nextToken()), day = n-1, cnt = 0;
        for (int i = 1; i < n; i++)  {
        	int x = Integer.parseInt(st.nextToken());
        	cnt += x - min;
        	if (x == min) day--;
        }
        
        System.out.println(cnt + " " + day);
        br.close();
    }
}