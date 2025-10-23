import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken()), max = b+1;
        
        while (h-- > 0) {
        	int p = Integer.parseInt(br.readLine()) * n;
        	st = new StringTokenizer(br.readLine(), " ");
        	if (p <= b) {
        		for (int i = 0; i < w; i++) if (Integer.parseInt(st.nextToken()) >= n && max > p) max = p; 
        	}
        }
        
        System.out.println(max <= b? max: "stay home");
        br.close();
    }
}
