import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int p = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken());
		int arr[] = new int[n+1];
		arr[1] = Integer.parseInt(br.readLine());
		int ans = arr[1];
		for (int i = 2; i <= n ;i++) {
			if (i%2 == 0) arr[i] += arr[i/2]*p + q;
			else arr[i] += arr[i/2]*r + s;
		}
		
		System.out.println(Arrays.stream(arr).sum());
		br.close();
	}

}