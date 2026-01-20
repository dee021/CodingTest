import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        double ans = 0;
        long[] arr = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        arr[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < n; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        	ans += Math.pow(arr[i-1] + arr[i], 2) + Math.pow(Math.abs(arr[i-1] - arr[i]), 2);
        }
        
		System.out.println((long)ans);
        br.close();
    }
}