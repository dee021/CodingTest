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
        int max = arr[n-1], res = 0;
        
        for (int i = n-2; i > -1; i--) {
        	if (arr[i] > max) max = arr[i];
        	else if (arr[i] < max) res += max - arr[i];
        }
        
        System.out.println(res);
        br.close();
    }
}