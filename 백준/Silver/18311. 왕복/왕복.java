import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken()), ans = 0;
        long k = Long.parseLong(st.nextToken()), s = 0;
        int[] arr = new int[n+1];
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= n; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        	s += arr[i];
        }
        
        if (k < s) {
        	for (int i = 1; i <= n; i++) {
        		k -= arr[i];
        		if (k < 0) {
        			ans = i;
        			break;
        		}
        	}
        } else {
        	k -= s;
        	for (int i = n; i > 0; i--) {
        		k -= arr[i];
        		if (k < 0) {
        			ans = i;
        			break;
        		} else if (k == 0) {
        			ans = i-1;
        			break;
        		}
        	}
        }

        System.out.println(ans);
        br.close();
    }
}