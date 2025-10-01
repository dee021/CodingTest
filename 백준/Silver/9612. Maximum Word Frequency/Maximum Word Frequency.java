import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), max = 0;
        String ans = "";
        Map<String, Integer> count = new HashMap<>();
        
        while (n-- > 0) {
        	String word = br.readLine();
        	if (!count.containsKey(word)) count.put(word, 1);
        	else count.put(word, count.get(word)+1);
        	
        	if (count.get(word) > max) {
        		max = count.get(word);
        		ans = word;
        	} else if(count.get(word) == max && word.compareTo(ans) > 0) {
        		ans = word;
        	}
        }
        
        System.out.println(ans + " " + max);
        br.close();
    }
}