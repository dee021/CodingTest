import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine(), b = br.readLine();
        
        if (a.equals(b)) System.out.println(0);
        else System.out.println(1550);
        
        br.close();
    }
}