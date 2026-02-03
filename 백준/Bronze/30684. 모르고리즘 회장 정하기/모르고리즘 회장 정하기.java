import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String ans = "ZZZZ";
        
        while (n-- > 0) {
        	String name = br.readLine();
        	if (name.length() == 3 && ans.compareTo(name) > 0) ans = name;
        }
        
        System.out.println(ans);
        br.close();
    }
}