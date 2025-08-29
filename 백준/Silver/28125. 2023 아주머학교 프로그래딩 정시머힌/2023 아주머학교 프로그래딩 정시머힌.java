import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        Map<Character, Character> charMap = new HashMap<>();
        
        for (int i = 0; i < 7; i++) {
        	charMap.put("@[!;^07".charAt(i), "acijnot".charAt(i));
        }
        
        while (n-- > 0) {
        	StringBuilder word = new StringBuilder(br.readLine());
        	int i = 0, cnt = 0;
        	while (i < word.length()) {
        		if (!Character.isAlphabetic(word.charAt(i))) {
        			cnt++;
        			if (i + 3 <= word.length() && word.substring(i, i+3).equals("\\\\'")) word.replace(i, i+3, "w");
        			else if (i + 2 <= word.length() && word.substring(i, i+2).equals("\\'")) word.replace(i, i+2, "v");
        			else {
        				word.replace(i, i+1, String.valueOf(charMap.get(word.charAt(i))));
        			}
        		}
        		i++;
        	}
        	
        	if (cnt >= word.length()/2.0) sb.append("I don't understand\n");
        	else sb.append(word.toString()).append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
    
}