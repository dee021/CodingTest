import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder line0 = new StringBuilder(), line1 = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        char[][] h = new char[2][];
        h[0] = "@   @".toCharArray();
        h[1] = "@@@@@".toCharArray();
        
        for (int i = 0; i < 5; i++) {
        	for (int j = 0; j < n; j++) {
        		line0.append(h[0][i]);
        		line1.append(h[1][i]);
        	}
        }
        
    	for (int l = 0; l < 5; l++) {
    		for (int c = 0; c < n; c++) {
    			if (l%2 == 0)System.out.println(line0);
    			else System.out.println(line1);
    		}
    	}
        br.close();
    }
}