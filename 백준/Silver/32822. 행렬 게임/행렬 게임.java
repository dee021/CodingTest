import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), diff;
		int[][] diffArr = new int[n][n];
		int[] maxDiff = new int[n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < n; j++) diffArr[i][j] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < n; j++) diffArr[i][j] = Math.abs(diffArr[i][j] - Integer.parseInt(st.nextToken()));
		}
		
		
		for (int c = 0; c < n; c++) {
			diff = 0;
			for (int r = 0; r < n; r++) diff = Math.max(diff, diffArr[r][c]);
			maxDiff[c] = diff;
		}
		
		diff = 0;
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < m; i++) {
			diff += maxDiff[Integer.parseInt(st.nextToken())-1];
		}

		System.out.println(diff);
		br.close();
	}
}