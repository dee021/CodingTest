import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int n = 0;
        
        while ((n = Integer.parseInt(br.readLine())) > -1) {
        	int dis = 0, time = 0;
        	
        	for (int i = 0; i < n; i++) {
        		st = new StringTokenizer(br.readLine(), " ");
        		int v = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken());
        		dis += v * (h - time);
        		time = h;
        	}
        	sb.append(dis).append(" miles\n");
        }
        
        
        System.out.print(sb);
        br.close();
    }
}