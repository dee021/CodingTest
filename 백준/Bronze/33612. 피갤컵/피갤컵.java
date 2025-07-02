import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = (Integer.parseInt(br.readLine())-1)*7 + 8, y = 2024 + n/12, m = n%12;
        if (m == 0) {
        	y--;
        	m = 12;
        }
        
        System.out.println(y + " " + m);
        br.close();
    }
}