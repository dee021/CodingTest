import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());
        
        while (tc-- > 0) {
        	st = new StringTokenizer(br.readLine(), " ");
        	String s = st.nextToken(), p = st.nextToken();
        	int len = s.length();
        	
        	s = s.replace(p, "");
        	int res = (len - s.length())/p.length() + s.length();
        	sb.append(res).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
    
}