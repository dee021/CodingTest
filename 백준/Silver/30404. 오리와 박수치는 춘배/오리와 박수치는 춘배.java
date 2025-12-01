import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), cnt = 1, idx = 0;
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        arr[0] = Integer.parseInt(st.nextToken());
        
        for (int i = 1; i < n; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        	if (arr[i] > arr[idx] + k) {
        		cnt++;
        		idx = i;
        	}
        }
        
        System.out.println(cnt);
        br.close();
    }
}