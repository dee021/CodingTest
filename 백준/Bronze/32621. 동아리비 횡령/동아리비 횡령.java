import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean flag = true, split = false;
        String input = br.readLine(), n1 = "", n2 = "";
        
        for (char c: input.toCharArray()) {
        	if (c == '+') split = true;
        	else if (c >= 'A') {
        		flag = false;
        		break;
        	} else if (split) n2 += c;
        	else n1 += c;
        }
        
        if (n1.isBlank() || !n1.equals(n2)) flag = false;
        else if (Integer.parseInt(n1) == 0 || n1.startsWith("0")) flag = false;
        
        System.out.println(flag?"CUTE":"No Money");
        br.close();
    }
}