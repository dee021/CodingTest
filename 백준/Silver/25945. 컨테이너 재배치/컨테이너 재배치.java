import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine()), total = 0;
        int[] arr = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
        	total += arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int min = total/n, max = total%n > 0? min+1: min;
        
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < n; i++) {
        	if (arr[i] < min) cnt1 += min - arr[i];
        	if (arr[i] > max) cnt2 += arr[i] - max;
        }
        
        System.out.println(Math.max(cnt1, cnt2));
        br.close();
    }
    
}