import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] vote = new int[n+1];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) vote[Integer.parseInt(st.nextToken())]++;
        
        int max = 0, ans = 0, cnt = 0;
        
        for (int i = 1; i < n+1; i++) {
        	if (vote[i] > max) {
        		max = vote[i];
        		ans = i;
        		cnt = 1;
        	} else if (vote[i] == max) {
        		cnt++;
        	}
        }
        
        System.out.println(cnt > 1? "skipped": ans);
        br.close();
    }
}