import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), cnt = 0, ans = 0;
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	arr[i] = -Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        int idx = 0;
        while (cnt < k) {
        	if (arr[idx] > ans) ans = arr[idx];
        	cnt++;
        	idx++;
        }
        
        System.out.println(ans);
        br.close();
    }
}