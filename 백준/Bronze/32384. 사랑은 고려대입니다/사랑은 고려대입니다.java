import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String outStr = "LoveisKoreaUniversity";
        int n = Integer.parseInt(br.readLine())-1;
        
        System.out.print(outStr);
        while (n-- > 0) {
        	System.out.print(" " + outStr);
        }
        br.close();
    }
}