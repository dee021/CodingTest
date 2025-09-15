import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 7, max = 0;
        String ans = "";
        
        while (n-- > 0) {
        	String[] input = br.readLine().split(" ");
        	
        	if (Integer.parseInt(input[1]) > max) {
        		max = Integer.parseInt(input[1]);
        		ans = input[0];
        	}
        }
        
        System.out.println(ans);
        br.close();
    }
}