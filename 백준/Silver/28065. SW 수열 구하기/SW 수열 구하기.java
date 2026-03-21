import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
        	if (i % 2 > 0) sb.append(i/2 + 1).append(" ");
        	else sb.append(n - i/2).append(" ");
        }
        
        System.out.println(sb);
        br.close();
    }
}