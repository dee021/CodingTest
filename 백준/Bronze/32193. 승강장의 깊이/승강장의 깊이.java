import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine()), a = 0, b = 0;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			a += Integer.parseInt(st.nextToken());
			b += Integer.parseInt(st.nextToken());
			sb.append(a-b).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}