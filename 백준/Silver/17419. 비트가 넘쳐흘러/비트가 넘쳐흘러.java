import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), cnt = 0;
        
        for (char k : br.readLine().toCharArray()) {
        	if (k == '1') cnt++;
        }
        
        System.out.println(cnt);
        br.close();
    }
}