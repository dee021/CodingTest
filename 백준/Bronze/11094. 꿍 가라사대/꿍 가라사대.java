import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        String simon = "Simon says ";
        
        while (n-- > 0) {
        	String input = br.readLine();
        	if (input.startsWith(simon)) sb.append(input.substring(simon.length()-1)).append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}