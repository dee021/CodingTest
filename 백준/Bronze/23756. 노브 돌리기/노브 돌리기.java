import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), prev = Integer.parseInt(br.readLine()), res = 0, cur, diff; 
        while (n-- > 0) {
        	cur = Integer.parseInt(br.readLine());
        	diff = Math.abs(cur-prev);
        	res += Math.min(diff, 360-diff);
        	prev = cur;
        }
        
        System.out.println(res);
        br.close();
    }
}