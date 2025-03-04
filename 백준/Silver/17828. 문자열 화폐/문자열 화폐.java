import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());
		int l = n;
		final int a = (int)'A'-1;

		while (n > 0 && n <= x && n*26 >= x) {
			if (x <= (n-1)*26) {
				sb.append('A');
				x--;
			}
			else if (x%26 == 0) {
				sb.append('Z');
				x -= 26;
			}
			else {
				sb.append((char)(a + x%26));
				x -= x%26;
			}
			n--;
		}
		System.out.println(sb.length() == l?sb:"!");
		br.close();
	}
}