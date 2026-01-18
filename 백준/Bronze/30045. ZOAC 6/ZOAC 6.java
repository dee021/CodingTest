import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), ans = 0;
        
        while (n-- > 0) {
        	char[] text = br.readLine().toCharArray();
        	
        	for (int i = 0; i < text.length-1; i++) {
        		if (text[i] == '0' && text[i+1] == '1') {
        			ans++;break;
        		}
        		if (text[i] == 'O' && text[i+1] == 'I') {
        			ans++;break;
        		}
        	}
        }
		
		System.out.println(ans);
        br.close();
    }
}