import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());
        
        while (tc-- > 0) {
        	int n = Integer.parseInt(br.readLine()), sum = 0, max = 0, no = 0, cnt = 0;
        	
        	for (int i = 1; i <= n; i++) {
        		int v = Integer.parseInt(br.readLine());
        		sum += v;
        		
        		if (max < v) {
        			max = v; no = i; cnt = 1;
        		} else if (max == v) cnt++;
        	}
        	
        	if (cnt > 1) sb.append("no winner\n");
        	else if (max * 2 <= sum) sb.append("minority winner ").append(no).append("\n");
        	else sb.append("majority winner ").append(no).append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}