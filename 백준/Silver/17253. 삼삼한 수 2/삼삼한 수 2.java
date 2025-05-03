import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static long n;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean[] base = new boolean[40];
		n = Long.parseLong(br.readLine());
		String answer = n != 0?"YES":"NO";
		while (n > 0) {
			int res = exp();
			if (base[res]) {
				answer = "NO";
				break;
			}
			base[res] = true;
		}
		System.out.println(answer);
		br.close();
	}
	
	static int exp() {
		if (n == 1) {
			n = 0;
			return 0;
		}
		int e = 0;
		long x = 1;
		while (x*3 <= n && e+1 < 40) {
			x *= 3;
			e++;
		}
		n -= x;
		return e;
	}
}