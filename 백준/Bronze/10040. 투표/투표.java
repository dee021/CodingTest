import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), max = 0, ans = 0;
        int[] cost = new int[n], cnt = new int[n];
        
        for (int i = 0; i < n; i++) {
        	cost[i] = Integer.parseInt(br.readLine());
        }
        
        for (int i = 0; i < m; i++) {
        	int h = Integer.parseInt(br.readLine());
        	for (int j = 0; j < n; j++) {
        		if (cost[j] <= h) {
        			cnt[j]++;
        			if (max < cnt[j]) {
        				max = cnt[j];
        				ans = j+1;
        			}
        			break;
        		}
        	}
        }
        
        System.out.println(ans);
        br.close();
    }   
}