import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		long ans = 1, p;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < n; i++) {
			p = Integer.parseInt(st.nextToken());
			if (isPrime(p)) {
				ans = lcm(ans, p);
			}
		}

		System.out.println(ans == 1? -1:ans);
		br.close();
	}
	
	private static boolean isPrime(long p) {
		if (p == 2) return true;
		else if (p%2 == 0) return false;
		
		int k = 3;
		while (k*k <= p) {
			if (p%k == 0) return false;
			k += 2;
		}
		return true;
	}
    
	private static long gcd(long a, long b) {
		long max = Math.max(a, b), min = Math.min(a, b), tmp;
		
		while (min > 0) {
			tmp = max % min;
			max = min;
			min = tmp;
		}
		return max;
	}
    
	private static long lcm(long a, long b) {
		long m = a * b, gcd = gcd(a, b);
		return m/gcd;
	}
}