import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String t = br.readLine().substring(0, 5);
        int n = Integer.parseInt(br.readLine()), cnt = 0;
        
        while (n-- > 0) {
        	if (br.readLine().substring(0, 5).equals(t)) cnt++;
        }
        
        System.out.println(cnt);
        br.close();
    }
}