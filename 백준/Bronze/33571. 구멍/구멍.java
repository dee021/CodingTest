import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ans = 0;
        int[] upperCase = new int[26], lowerCase = new int[26];
        
        for (char c: "ABDOPQR".toCharArray()) {
        	upperCase[c-'A']++;
        	if (c == 'B')upperCase[c-'A']++;
        }
        
        for (char c: "abdegopq".toCharArray()) {
        	lowerCase[c-'a']++;
        }
        
        for (char c: br.readLine().toCharArray()) {
        	if (c == '@') ans++;
        	else if (c == ' ') continue;
        	else if (c < 'a') ans += upperCase[c - 'A'];
        	else ans += lowerCase[c - 'a'];
        }
        
        System.out.println(ans);
        br.close();
    }
}