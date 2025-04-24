import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), idx = 0;
		int[] arr = new int[n];
		for (char c:br.readLine().toCharArray()) arr[idx++] = c - 'A';

		for (int i = 0; i < n; i++) {
			if (arr[i] > 0 && 26-arr[i] <= k) {
				k -= 26-arr[i];
				arr[i] = 0;
			} 
        }
		arr[n-1] = (arr[n-1] + k)%26;
		k = 0;
        
		for (int i:arr) sb.append((char)(i+'A'));
		System.out.println(sb);
		br.close();
	}
}