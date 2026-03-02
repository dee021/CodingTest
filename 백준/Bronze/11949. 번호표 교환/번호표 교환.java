import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        for (int i = 1; i < n+1; i++) arr[i] = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= m; i++) {
        	for (int j = 1; j < n; j++) {
        		if (arr[j] % i > arr[j+1] % i) {
        			int t = arr[j];
        			arr[j] = arr[j+1];
        			arr[j+1] = t;
        		}
        	}
        }
        
        for (int i = 1; i <= n; i++) sb.append(arr[i]).append("\n");
        
        System.out.print(sb);
        br.close();
    }
}