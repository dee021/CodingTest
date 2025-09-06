import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int s = 2*Integer.parseInt(br.readLine());

        System.out.println((int)Math.sqrt(s) * 4);
        br.close();
    }
}