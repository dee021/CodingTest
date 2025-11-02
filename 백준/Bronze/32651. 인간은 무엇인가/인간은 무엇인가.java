import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        boolean range = 2024 <= n && n <= 100_000;
        
        if (range && n % 2024 == 0) System.out.println("Yes");
        else System.out.println("No");
        
        br.close();
    }
}