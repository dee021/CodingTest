import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[][] books, memo;
	static int[] target = new int[27];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for (char c: br.readLine().toCharArray()) target[c-'A']++;
		target[26] = -1;
		int n = Integer.parseInt(br.readLine());
		books = new int[n][27];
		memo = new int[1<<n][27];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			books[i][26] = Integer.parseInt(st.nextToken());
			for (char c: st.nextToken().toCharArray()) books[i][c-'A']++;
		}
		memozation(n, 0);
		System.out.println(target[26]);
		br.close();
	}
	
	static void memozation(int n, int bit) {
		int r;
		boolean flag;
		for (int i = 0; i < n; i++) {
			if ((bit & (1<<i)) != (1<<i)) {
				r = bit | (1<<i);
				if (memo[r][26] > 0) continue;
				flag = true;
				for (int j = 0; j < 27; j++) {
					memo[r][j] = memo[bit][j] + books[i][j];
					if (j < 26 && target[j] > memo[r][j]) flag = false;
				}
				if (flag) target[26] = target[26] == -1?memo[r][26]:Math.min(memo[r][26], target[26]);
				memozation(n, r);
			}
		}
	}
}