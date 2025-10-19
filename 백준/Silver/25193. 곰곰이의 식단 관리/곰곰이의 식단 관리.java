import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        int c = 0, o = 1;
        
        for (char i : br.readLine().toCharArray()) {
        	if (i == 'C') c++;
        	else o++;
        }
        
        int a = c/o;
        if (c%o > 0) a++;
        
        System.out.println(a);
        br.close();
    }
}