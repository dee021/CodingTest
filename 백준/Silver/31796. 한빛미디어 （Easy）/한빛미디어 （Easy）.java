import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()), page = 0;
		int[] price = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			price[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(price);
		
		int idx = 0, min;
		while (idx < n) {
			page++;
			min = price[idx];
			while (idx < n && price[idx] < min*2)idx++;
		}
		System.out.println(page);

		br.close();
	}	
}