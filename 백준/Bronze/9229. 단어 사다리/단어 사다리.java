import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
        	char[] word = br.readLine().toCharArray();
            
        	if (word.length < 3) break;
        	
        	String s;
        	boolean flag = true;
        	while (!(s = br.readLine()).equals("#")) { 
        		if (s.length() != word.length) flag = false; 
        		int cnt = 0;
        		
        		for (int i = 0; i < word.length; i++) {
        			if (s.charAt(i) != word[i]) {
        				cnt++;
        				word[i] = s.charAt(i);
        			}
        		}
        		
        		if (cnt != 1) flag = false;
        	}
        	
        	if (flag) sb.append("Correct\n");
        	else sb.append("Incorrect\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}