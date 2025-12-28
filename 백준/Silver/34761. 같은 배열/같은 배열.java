import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), flag = 1;
        int[] arr = new int[n];
        boolean[] num = new boolean[n+1];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        	num[arr[i]] = true;
        }
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
        	if (Integer.parseInt(st.nextToken()) != arr[i]) flag = 0;
        }
        
        for (int i = 0; i < n; i++) {
        	if (!num[Integer.parseInt(st.nextToken())]) flag = 0;
        }
        
        System.out.println(flag > 0? "YES": "NO");
        br.close();
    }
}