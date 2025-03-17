import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		int k = Integer.parseInt(br.readLine()), c = Integer.parseInt(br.readLine()), m, n, round;

		for (int i =0 ; i < c; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			round = k - Math.max(m, n);
			if (m == n) sb.append(1);
			else if (m > n) {
				if ((m - n) - round > 2) sb.append(0);
				else sb.append(1);
			} else {
				if ((n - m) - round > 1) sb.append(0);
				else sb.append(1);
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}