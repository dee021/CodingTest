import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long me = Integer.parseInt(st.nextToken());
		long[] atk = new long[n-1];
		for (int i = 0; i < n-1; i++) atk[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(atk);
		String answer = "Yes";
		for (int i = 0; i < n-1; i++) {
			if (me <= atk[i]) {
				answer = "No";
				break;
			} else if (me > atk[i]) me += atk[i];
		}
		System.out.println(answer);
	}
}