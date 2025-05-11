import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()),ans = 0;
        
        while (n > 0) {
        	if (n < 10) {
        		ans++;
        		break;
        	}
        	for (int k = 9; k > 0; k--) {
        		if (n >= k*2) {
        			n -= k*2;
        			ans += 2;
        			break;
        		}
        	}
        }
        
        System.out.println(ans);
        br.close();
    }
}