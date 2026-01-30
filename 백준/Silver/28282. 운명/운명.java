import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        long ans = 0;
        int[] right = new int[k+1], left = new int[k+1];
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) left[Integer.parseInt(st.nextToken())]++;
        for (int i = 0; i < n; i++) right[Integer.parseInt(st.nextToken())]++;
        
        for (int i = 1; i <= k; i++) {
        	ans += (long)left[i] * (n - right[i]);
        }
        
        System.out.println(ans);
        br.close();
    }
}