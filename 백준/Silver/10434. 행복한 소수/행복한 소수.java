import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	static boolean[] prime = new boolean[10001];
	static boolean[] happyNum = new boolean[10001];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		setPrimeArray();
		StringBuilder sb = new StringBuilder();
		int m = Integer.parseInt(br.readLine()), t, n;
        StringTokenizer st;
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			t = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			if (prime[n] && isHappy(n)) sb.append(String.format("%d %d YES\n", t, n));
			else sb.append(String.format("%d %d NO\n", t, n));
		}
		System.out.println(sb);
		br.close();
	}
	
	static void setPrimeArray() {
		prime[2] = true;
		for (int i = 3; i < 10001; i+=2) prime[i] = true;
		
		int k;
		for (int p = 3; p * p < 10001; p += 2) {
			if (!prime[p]) continue;
			k = 2;
			while (p*k < 10001) {
				prime[p*k] = false;
				k++;
			}
		}
	}
	
	static boolean isHappy(int k) {
		if (happyNum[k]) return true;
		HashSet<Integer> set = new HashSet<>();
		int res, n;
		while (k > 1) {
			res = 0;
			while (k > 0) {
				n = k%10;
				res += n*n;
				k /=10;
			}
			k = res;
			res = 0;
			if (set.contains(k)) return false;
			set.add(k);
		}
		if (k == 1) {
			for (Integer e:set) if(e < 10001)happyNum[e] = true;
			return true;
		}
		return false;
	}
}