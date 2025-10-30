import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        while (n > 0) {
        	int col = 0;
        	boolean read = false;
        	for (int i = 0; i < n; i++) {
        		String line = br.readLine();
        		while (col < line.length()) {
        			if (read && line.charAt(col) == ' ') break;
        			if (!read && line.charAt(col) != ' ') read = true;
        			col++;
        		}
        	}
        	sb.append(col+1).append("\n");
        	n = Integer.parseInt(br.readLine());
        }
        
        System.out.println(sb);
        br.close();
    }
}