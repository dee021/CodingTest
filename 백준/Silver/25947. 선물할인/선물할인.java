import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		long[] arr = new long[n];
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) arr[i] = Long.parseLong(st.nextToken());
		Arrays.sort(arr);
		
		long c = 0, dc = 0;
		int cnt = 0; 
		
		for (int i = 0; i < n; i++) {
			if (i < a) dc += arr[i]/2;
			else {
				dc += arr[i]/2 - arr[i - a]/2;
				c += arr[i - a];
			}
			if (c + dc > b) break;
			cnt++;
		}

		System.out.println(cnt);
		br.close();
		
	}
}