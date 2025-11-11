import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine());
        
        while (tc-- > 0) {
        	int n = Integer.parseInt(br.readLine()), cnt = 0, cur = 1, post = 0;
            int[] fg = new int[n+1];
            
            for (int i = 1; i <= n; i++) fg[i] = Integer.parseInt(br.readLine());
            
            boolean flag = false;
            while (fg[cur] > 0 && !flag) {
            	cnt++;
            	post = fg[cur];
            	fg[cur] = 0;
            	cur = post;
            	if (cur == n) flag = true;
            }
            
            if (flag) sb.append(cnt).append("\n");
            else sb.append("0\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}