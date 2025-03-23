import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static int n = 100000;
	private static boolean[] prime = new boolean[n+1];
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		makePrimeArr();
		int t = Integer.parseInt(br.readLine()), k;
		
		for (int i = 0; i < t; i++) {
			k = Integer.parseInt(br.readLine());
			while (!sol(k)) k++;
			sb.append(k).append("\n");
		}
		System.out.println(sb);
	}
	
	private static void makePrimeArr() {
		prime[2] = true;
		for (int i = 3; i <= n; i += 2) {
			prime[i] = true;
		}
		
		int k;
		for (int i = 3; i*i <= n; i+=2) {
			if (!prime[i]) continue;
			k = 2;
			while (i*k <= n) prime[i*k++] = false;
		}
		return;
	}
	
	private static boolean sol(int k) {
		if (k%2 == 0 && prime[k/2] && k/2 != 2) return true;
		
		for (int p = 3; p <= k; p+=2) {
			if (!prime[p]) continue;
			if (k%p == 0 && prime[k/p] && p != k/p) return true;
		}
		return false;
	}
}