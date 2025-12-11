import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        while (n-- > 0) {
        	int acc = 0, w = 0;
        	boolean wp = false, zn = false;
        	
        	for (char c: br.readLine().toCharArray()) {
        		int tmp = c - '0';
        		if (tmp > 9) tmp -= 7;
        		if (acc/10 < (acc + tmp)/10) {
        			if ((acc + tmp)/10 <= 3) w += (acc+tmp) / 10;
        			else if ((acc + tmp)/10 < 5) wp = true;
        			else if (!wp) zn = true;
        		}
        		
        		acc += tmp;
        		
        		if (wp || zn) break;
        	}
        	
        	sb.append(w);
        	if (wp) sb.append("(weapon)");
        	else if (zn) sb.append("(09)");
        	sb.append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}