import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        for (char c: br.readLine().toCharArray()) {
        	if ("AJV".indexOf(c) >= 0) continue;
        	sb.append(c);
        }
        
        System.out.println(sb.length() < 1? "nojava":sb);
        br.close();
    }
}