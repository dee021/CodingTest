import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken()), cnt = 1;
		int[] arr = new int[n];
		
        st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++)  arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		
		for (int i = 1; i < n; i++) if(arr[i] - arr[i-1] >= e) cnt++; 
		System.out.println(cnt);
		br.close();
	}
}