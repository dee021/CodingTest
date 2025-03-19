import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static int n, m;
	private static int[][] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < m; j++) arr[i][j] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0, res;
		for (int i = 0; i < m-2; i++) {
			for (int j = i+1; j < m-1; j++) {
				for (int k = j+1; k < m; k++) {
					res = select(i, j, k);
					max = Math.max(max, res);
				}
			}
		}

		System.out.print(max);
		br.close();
	}

	private static int select(int i, int j, int k) {
		int res = 0;
		for (int p = 0; p < n; p++) {
			res += Math.max(arr[p][i], Math.max(arr[p][j], arr[p][k]));
		}
		return res;
	}
}