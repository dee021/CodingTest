import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()), M = 1000000007;
        long answer = 0;
		int[] height = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			height[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(height);
		
		for (int i = n-1; i > -1; i--) {
			answer = ((answer * 2)%M + height[i]) % M;
		}
		
		System.out.println(answer);
		br.close();
	}
}