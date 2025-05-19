import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), cnt = 0;
        int[] order = new int[n];
        
        for (int i = 0; i < n; i++) {
        	order[Integer.parseInt(br.readLine())-1] = i;
        }
        
        for (int i = 1; i < n; i++) {
        	if (order[i-1] > order[i]) cnt++;
        }
        
        System.out.println(cnt);
        br.close();
    }
}