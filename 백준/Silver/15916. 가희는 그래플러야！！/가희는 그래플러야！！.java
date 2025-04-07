import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i < n+1; i++) arr[i] = Integer.parseInt(st.nextToken());
		long k = Long.parseLong(br.readLine());
		char ans = 'F';
		if (arr[1] != k) {
			for (int x = 2; x < n+1; x++) {
				if (arr[x-1] >= k*(x-1) && arr[x] <= k * x) {
					ans = 'T';
					break;
				} else if (arr[x-1] <= k*(x-1) && arr[x] >= k * x) {
					ans = 'T';
					break;
				}
			}
		} else ans = 'T';
		
		System.out.println(ans);
		br.close();
	}
}