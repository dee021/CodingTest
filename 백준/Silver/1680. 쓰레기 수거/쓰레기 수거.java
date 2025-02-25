import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine()), weights, n, w = 0, d = 0;
		long disL, wL;
		
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			weights = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			disL = wL = 0;
			for (int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				d = Integer.parseInt(st.nextToken());
				w = Integer.parseInt(st.nextToken());
				if (w + wL > weights) {
					disL += d * 2;
					wL = 0;
				}
				wL += w;
				if (wL == weights) {
					disL += d * 2;
					wL = 0;
				}
			}
			if (wL > 0)disL += d*2;
			sb.append(disL + "\n");
		}
		System.out.println(sb);
		br.close();
	}
}