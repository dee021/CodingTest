import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
        
		int cnt = 1, max = ++arr[n-1], s = 1;
		for (int i = n-2; i > -1; i--) {
			if (arr[i] + n >= max) cnt++;
			max = Math.max(max, arr[i] + ++s);
		}
		System.out.println(cnt);
		br.close();
	}
}