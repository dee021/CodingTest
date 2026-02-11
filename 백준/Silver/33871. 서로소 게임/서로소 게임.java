import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String ans = "";
        
        if (n % 2 > 0) ans = "Soomin";
        else ans = "Song";
        
        
        System.out.println(ans);
        
        br.close();
    }
}