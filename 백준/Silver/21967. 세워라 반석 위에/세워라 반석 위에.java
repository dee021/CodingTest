import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] last = new int[11];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int k = Integer.parseInt(st.nextToken()), len = 1, ans = 1;
        last[k] = 1;
        
        for (int idx = 2; idx < n+1; idx++) {
        	k = Integer.parseInt(st.nextToken());
        	last[k] = idx;
        	len++;
        	for (int j = 1; j <= 10; j++) {
        		if (Math.abs(k - j) <= 2)  continue;
        		len = Math.min(len, idx - last[j]);
        	}
        	
        	ans = Math.max(ans, len);
        }
        
        System.out.println(ans);
        br.close();
    }
}