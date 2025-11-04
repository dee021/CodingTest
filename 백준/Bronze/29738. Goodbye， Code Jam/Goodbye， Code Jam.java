import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= tc; i++) {
        	sb.append("Case #").append(i);
        	int x = Integer.parseInt(br.readLine());
        	if (x <= 25) sb.append(": World Finals\n");
        	else if (x <= 1000) sb.append(": Round 3\n");
        	else if (x <= 4500) sb.append(": Round 2\n");
        	else sb.append(": Round 1\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}