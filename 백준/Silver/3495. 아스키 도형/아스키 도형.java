import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.*;

public class Main {
	static float ans;
	static String line;
	static char x;
	public static void main(String[] args) throws IOException {
		ans = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());

		for (int r = 0; r < h; r++) {
			line = br.readLine();
			boolean flag = false;
			for (int c = 0; c < w; c++) {
				x = line.charAt(c);
				if (x == '.' && flag)
					ans += 1;
				else if (x != '.' && flag) {
					ans += 0.5;
					flag = false;
				}
				else if (x != '.' && !flag) {
					ans += 0.5;
					flag = true;
				}
			}
		}
		System.out.print(Math.round(ans));
	}
}