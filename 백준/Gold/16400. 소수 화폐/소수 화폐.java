import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	private static boolean[] prime;
	private static int[] nPrime;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()), M = 123456789;
		prime = new boolean[n+1];
		makePrimeArr(n);
		int[] dp = new int[n+1];
		int k;
		for (int i = nPrime.length-1; i > -1; i--) {
			k = nPrime[i];
			dp[k]++;
			for (int j = k; j <= n-k; j++) {
				if (dp[j] > 0) dp[j+k] += dp[j];
				dp[j+k] %= M;
			}
		}
		
		System.out.println(dp[n]);
		br.close();
	}
	
	private static void makePrimeArr(int n) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		for (int i = 3; i <= n; i += 2) {
			prime[i] = true;
		}
	
		int k;
		for (int i = 3; i < n+1; i+=2) {
			if (!prime[i]) continue;
			al.add(i);
			if (i*i > n) continue;
			k = 2;
			while (i*k <= n) prime[i*k++] = false;
		}
		nPrime = new int[al.size()];
		for (int i = 0; i < al.size(); i++) nPrime[i] = al.get(i);
		return;
	}
}