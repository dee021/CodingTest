import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] count = new int[26];
        for (char c : br.readLine().toCharArray()) count[c - 'a']++;
        
        boolean odd = false, even = false;
        for (int i = 0; i < 26; i++) {
        	if (count[i] > 0) {
        		if (count[i] % 2 == 0) even = true;
        		else odd = true;
        	}
        }
        
        if (odd && even) System.out.println("0/1");
        else if (odd) System.out.println("1");
        else System.out.println("0");
        
        br.close();
    }
}