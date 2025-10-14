import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine()), cnt = 0;
        
        while (n-- > 0) {
        	st = new StringTokenizer(br.readLine(), " ");
        	sb.append(st.nextToken()).append(" ");
        	
        	int s = Integer.parseInt(st.nextToken());
        	if (s < 60) sb.append("F\n");
        	else if (s == 100) sb.append("A+\n");
        	else {
        		sb.append(s < 90? (char)('A' + (9 - s/10)):"A");
        		if (s%10 > 6) sb.append("+");
        		sb.append("\n");
        	}
        }
        
        System.out.print(sb);
        br.close();
    }

}