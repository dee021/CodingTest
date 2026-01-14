import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), max = 0;
        int[] arr = new int[n];
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
        	if (i < n) max = Math.max(max, Integer.parseInt(st.nextToken()) - arr[i]);
        	else max = Math.max(max, Integer.parseInt(st.nextToken()));
        }
        
        System.out.println(max);
        br.close();
    }
}