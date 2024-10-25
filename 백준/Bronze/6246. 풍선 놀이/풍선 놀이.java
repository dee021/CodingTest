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
		int[] arr = new int[n+1];
		int q = Integer.parseInt(st.nextToken());
		int idx, gap;
		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			idx = Integer.parseInt(st.nextToken());
			gap = Integer.parseInt(st.nextToken());
			for (int j = idx; j < n+1; j = j + gap) arr[j] = 1;
		}
		
		int answer = n - Arrays.stream(arr).sum();
		System.out.println(answer);
	}	
}