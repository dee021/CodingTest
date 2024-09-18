import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int score(int[] n_array) {
		int r = Math.max(n_array[0], n_array[1]);
		int a = 0; int b = 0;
		int tmp;
		for (int i=2; i<7; i++) {
			if (n_array[i] > b) {
				b = n_array[i];
				if (b > a) {
					tmp = b;
					b = a;
					a = tmp;
				}
			}
		}
		return r + a + b;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int [] array = new int[7];
		int n = Integer.parseInt(br.readLine());
		int answer = 0;
		for (int i = 0; i < n; i++) {
			 st = new StringTokenizer(br.readLine(), " ");
			 for (int j =0; j < 7; j++) array[j] = Integer.parseInt(st.nextToken());
			 answer = Math.max(answer, score(array));
		}
		System.out.println(answer);
	}
}