import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), total = 0, sub = 0;
        int[] arr = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for (int i = 0; i < n; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        	total += arr[i];
        }
        
        st = new StringTokenizer(br.readLine(), " ");
        
        for (int i = 0; i < n; i++) {
        	if (Integer.parseInt(st.nextToken()) == 0) sub += arr[i];
        }
        
        System.out.println(total);
        System.out.println(sub);
        br.close();
    }
}
