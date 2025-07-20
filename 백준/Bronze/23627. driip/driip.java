import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean ans = br.readLine().endsWith("driip");
        System.out.println(ans?"cute":"not cute");
        
        br.close();
    }
}