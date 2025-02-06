import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static BufferedReader br;
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		long ans = 0;
		int[] dep = new int[n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int sum = 0, p = Integer.parseInt(st.nextToken());
			for (int j = 0; j < p; j++) {
				sum += Integer.parseInt(st.nextToken());
			}
			dep[i] = sum;
		}
		
		Arrays.sort(dep);
		for (int i = 0; i < n; i++) ans += dep[i] * (n-i);
		
		System.out.println(ans);

		br.close();
	}
}