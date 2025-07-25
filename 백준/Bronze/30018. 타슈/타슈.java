import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), res = 0;
        int[] arr = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
        	int c = Integer.parseInt(st.nextToken());
        	
        	if (c < arr[i]) res += arr[i] - c;
        }
        
        System.out.println(res);
        br.close();
    }
}