import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int s = 0;
        char[] pz = "ABCDEFGHIJKLMNO.".toCharArray(); 
        
        for (int i = 0; i < 4; i++) {
        	char[] line = br.readLine().toCharArray();
        	for (int j = 0; j < 4; j++) {
                if (line[j] == '.') continue;
        		int idx = -1;
        		for (int k = 0; k < 16; k++) if (pz[k] == line[j]) {
        			idx = k;
        			break;
        		}
        		s += Math.abs(idx/4 - i) + Math.abs(idx%4 - j);
        	}
        }
        
        System.out.println(s);
        
        br.close();
    } 
}