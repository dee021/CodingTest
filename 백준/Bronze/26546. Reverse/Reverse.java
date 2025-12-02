import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        while (n-- > 0) {
        	st = new StringTokenizer(br.readLine(), " ");
        	String str = st.nextToken();
        	int i = Integer.parseInt(st.nextToken()), j = Integer.parseInt(st.nextToken());
        	
        	for (int idx = 0; idx < str.length(); idx++) {
        		if (i <= idx && idx < j) continue;
        		sb.append(str.charAt(idx));
        	}
        	sb.append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}