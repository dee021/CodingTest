import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		int[] count = new int[n+1];
		count[0] = count[1] = 1;
		for (int i = 2; i < n+1; i++) {
			for (int j = 1; j < 4; j++) if (i >= j)count[i] += count[i-j];
		}
		if (count[n] < k) System.out.println(-1);
		else sol(n, k, 0, "");

		br.close();
	}
	
	private static int sol(int n, int k, int count, String res) {
		if (n == 0) {
			count++;
			if (count == k) System.out.println(res.replaceFirst("[+]", ""));
			return count;
		}
		
		for (int i = 1; i < 4; i++) {
			if (n >= i) count = sol(n-i, k, count, res + "+" + i);
			if (count == k) return k;
		}
		
		return count;
	}
}