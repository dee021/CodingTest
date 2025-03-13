import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long res = sol(br.readLine().split(" "));
		System.out.println(res);
		br.close();
	}
	
	private static long sol(String[] input) {
		long n = Long.parseLong(input[0]), r = Long.parseLong(input[1]);
		long res = 0;
		if (n-r <= r) return 0;
		long m = n - r;
		
		for (long i = 1; i*i <= m; i++) {
			if (m%i == 0) {
				if (i > r) res += i;
				if (i != (m/i) && m/i > r) res += (m/i);
			}
		}

		return res;
	}
}