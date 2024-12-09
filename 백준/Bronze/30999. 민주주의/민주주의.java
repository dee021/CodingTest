import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int answer = 0;
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		float half = m/2.0f;

		for (int i = 0; i < n; i++) {
			int agree = br.readLine().strip().replace("X", "").length();
			if (agree > half) answer++;
		}

		System.out.println(answer);
		br.close();
	}	
}