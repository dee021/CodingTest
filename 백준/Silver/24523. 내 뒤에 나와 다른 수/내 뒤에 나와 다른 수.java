import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine()), start = 0, cnt = 1;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int pre = Integer.parseInt(st.nextToken());
        
        for (int i = 1; i < n; i++) {
        	int cur = Integer.parseInt(st.nextToken());
        	
        	if (pre == cur) {
        		cnt++;continue;
        	} else {
        		for (int j = start; j < start + cnt; j++) {
        			sb.append(i+1).append(" ");
        		}
        		start = i; cnt = 1; pre = cur;
        	}
        }
        
        for (int i = start; i < n; i++) {
        	sb.append(-1).append(" ");
        }
        
        System.out.println(sb);
        br.close();
    } 
}