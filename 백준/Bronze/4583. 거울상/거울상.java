import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(), line = new StringBuilder();
        
        char[] table = new char[26];
        table['b' - 'a'] = 'd'; table['d' - 'a'] = 'b';
        table['p' - 'a'] = 'q'; table['q' - 'a'] = 'p';
        for (char c:"iovwx".toCharArray()) table[c - 'a'] = c;
        
        
         while (true) {
        	String input = br.readLine();
        	if (input.equals("#")) break;
        	line.setLength(0);
        	
        	boolean flag = true;
        	for (char c:input.toCharArray()) {
        		if (table[c - 'a'] >= 'a') line.append(table[c - 'a']);
        		else {
        			flag = false;break;
        		}
        	}
        	
        	if (flag) sb.append(line.reverse().toString()).append("\n");
        	else sb.append("INVALID\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}