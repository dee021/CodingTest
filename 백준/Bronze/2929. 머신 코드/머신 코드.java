import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        char[] input = br.readLine().toCharArray();
        
        for (int i = 0; i < input.length; i++) {
        	if (Character.isUpperCase(input[i]) && (i + cnt) % 4 != 0) cnt += 4 - (i + cnt) % 4;
        }
        
        System.out.println(cnt);
        br.close();
    }
}