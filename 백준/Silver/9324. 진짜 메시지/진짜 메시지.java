import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine());
        
        while (tc-- > 0) {
        	int[] alpha = new int[26];
        	String msg = br.readLine();
        	boolean flag = true;
        	for (int i = 0; i < msg.length(); i++) {
        		char c = msg.charAt(i);
        		if (++alpha[c - 'A'] == 3) {
        			alpha[c - 'A'] = 0;
        			if (i < msg.length() -1 && c == msg.charAt(i+1)) {
        				i++;continue;
        			}
        			flag = false;
        			break;
        		}
        	}
        	
        	sb.append(flag? "OK\n": "FAKE\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}