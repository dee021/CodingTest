import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), k = 2;
        boolean ans = n < 10;
        
        gugu:for (int i = 2; i < 10; i++) {
        	for (int j = 2; j < 10; j++) {
        		if (i * j == n) {
        			ans = true;
        			break gugu;
        		}
        	}
        }
        
        System.out.println(ans? 1: 0);

        br.close();
    }
}