import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
        StringBuilder sb = new StringBuilder();

        for (char c: br.readLine().toCharArray()) {
        	String i = (int)c + "";
        	int res = 0;
        	for (char n:i.toCharArray()) {
        		res += n - '0';
        	}
        	
        	while (res-- > 0) sb.append(c);
        	sb.append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}