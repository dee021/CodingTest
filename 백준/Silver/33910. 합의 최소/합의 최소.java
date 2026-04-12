import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        long ans = arr[n-1], min = arr[n-1];
        
        for (int i = n-2; i >= 0; i--) {
        	min = Math.min(min, arr[i]);
        	ans += min;
        }
        
        System.out.println(ans);
        br.close();
    }
}