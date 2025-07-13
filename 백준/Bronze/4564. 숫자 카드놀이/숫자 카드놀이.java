import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int cur = Integer.parseInt(br.readLine());
        while (cur > 0) {
        	sb.setLength(0);
        	sb.append(cur);
        	while (cur > 9) {
        		int res = 1;
        		for (char c: String.valueOf(cur).toCharArray()) {
        			res *= c-'0';
        		}
        		cur = res;
        		sb.append(' ').append(cur);
        	}
        	System.out.println(sb);
        	cur = Integer.parseInt(br.readLine());
        }
        
        br.close();
    }
}