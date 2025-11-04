import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int[] fibo = new int[46];
        fibo[0] = fibo[1] = 1;
        
        for (int i = 2; i < 46; i++) fibo[i] = fibo[i-1] + fibo[i-2];
        
        int n = Integer.parseInt(br.readLine());
        
        while (n-- > 0) {
        	int f = Integer.parseInt(br.readLine());
        	sb.append(fibo[f]).append("\n");
        }
        
        System.out.println(sb);
        br.close();
    }
}