import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine()), total = 0;
        int[] price = new int[n+1];
        
        for (int i = 1; i <= n; i++) price[i] = Integer.parseInt(br.readLine());
        
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) total += price[Integer.parseInt(br.readLine())];
        
        System.out.println(total);
        br.close();
    }
}