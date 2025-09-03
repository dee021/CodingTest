import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine()), ans = 0;
        int[] cnt = new int[51];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for (int i = 0; i < n; i++) {
        	cnt[Integer.parseInt(st.nextToken())]++;
        }
        
        for (int i = 0; i <= n; i++) {
        	if (i == cnt[i]) ans = i;
        }
        
        if (ans == 0 && cnt[0] > 0) {
        	ans = -1;
        }
        
        System.out.println(ans);
        br.close();
    }
}