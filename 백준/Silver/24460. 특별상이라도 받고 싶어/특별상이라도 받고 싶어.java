import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	private static int n;
	private static int[][] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < n; j++) arr[i][j] = Integer.parseInt(st.nextToken());
		}

		System.out.println(recursionFunc(n, 0, 0));
		br.close();
	}
	
	private static int recursionFunc(int n, int r, int c) {
		if (n == 1) return arr[r][c];
		int[] tmp = new int[4];
		int nextN = n >>1;
		tmp[0] = recursionFunc(nextN, r, c);
		tmp[1] = recursionFunc(nextN, r, c + nextN);
		tmp[2] = recursionFunc(nextN, r + nextN, c);
		tmp[3] = recursionFunc(nextN, r + nextN, c + nextN);
		Arrays.sort(tmp);
		return tmp[1];
	}
}