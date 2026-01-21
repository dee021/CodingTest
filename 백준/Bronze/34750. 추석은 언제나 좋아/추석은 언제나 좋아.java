import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        double k = 0;
        
        if (n >= 1_000_000) k = 0.2;
        else if (n >= 500_000) k = 0.15;
        else if (n >= 100_000) k = 0.1;
        else k = 0.05;
        
        int m = (int)(n*k);
		System.out.println(m + " " + (n-m));
        br.close();
    }
}