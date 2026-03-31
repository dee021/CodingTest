import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine(), ans = "";
        switch(input.charAt(0)) {
        	case 'F':
        		ans = "Foundation";break;
        	case 'C':
        		ans = "Claves";break;
        	case 'V':
        		ans = "Veritas";break;
        	case 'E':
        		ans = "Exploration";break;
        }
        
        System.out.println(ans);
        br.close();
    }
}