import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), frz = 0, max = 0, cur = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        while (n-- > 0) {
        	int p = Integer.parseInt(st.nextToken());
        	if (frz > 0) frz--;
        	
        	if (p > 0) cur++;
        	else if (frz == 0) frz = 2;
        	else cur = 0;
        	
        	max = Math.max(max, cur);
        }
        
        System.out.println(max);
        br.close();
    }
}