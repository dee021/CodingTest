import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine());
        
        while (tc-- > 0) {
        	int x = Integer.parseInt(br.readLine()), res = 0;
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        	while (st.hasMoreTokens()) {
        		String o = st.nextToken();
        		if (o.equals("+")) continue;
        		res += o.equals("!")? 10: Integer.parseInt(o);
        	}
        	
        	sb.append(res > 9? "!": res).append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}