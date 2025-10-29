import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()) -1, f = Integer.parseInt(br.readLine());
        boolean ez = true, hard = true;
        
        while (n-- > 0) {
        	int l = Integer.parseInt(br.readLine());
        	if (ez && f > l) ez = false;
        	if (hard && f < l) hard = false;
        }
        
        if (!ez && !hard) System.out.println("?");
        else System.out.print(ez? "ez": "hard");
        
        br.close();
    }
}