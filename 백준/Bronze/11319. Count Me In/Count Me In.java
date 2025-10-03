import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        Set<Character> vowels = new HashSet();
        for (char a: "AEIOUaeiou".toCharArray()) vowels.add(a);

        int n = Integer.parseInt(br.readLine());
        
        while (n-- > 0) {
        	int c = 0, v = 0;
        	for (char a: br.readLine().toLowerCase().toCharArray()) {
        		if (a == ' ') continue;
        		if (vowels.contains(a)) v++;
        		else c++;
        	}
        	
        	sb.append(c).append(" ").append(v).append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}