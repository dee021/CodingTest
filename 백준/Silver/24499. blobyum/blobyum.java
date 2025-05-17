import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), max = 0, sum = 0;
        int[] arr = new int[n];
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        	sum += arr[i];
        	if (i >= k) sum -= arr[i-k];
        	max = Math.max(max, sum);
        }
        
        for (int i = 0; i < k-1; i++) {
        	sum += arr[i];
        	sum -= arr[n-k+i];
        	max = Math.max(max, sum);
        }
        System.out.println(max);
        br.close();
    }
}