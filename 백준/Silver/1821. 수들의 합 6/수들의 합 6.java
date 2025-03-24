import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int n, f;
	static boolean[] visited;
	static int[] output;
	static int[][] pascal;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		n = Integer.parseInt(st.nextToken());
		f = Integer.parseInt(st.nextToken());
		pascal = new int[n][n];
		pascal[0][0] = 1;
		
		for (int i = 1; i <n; i++) {
			pascal[i][0] = 1;
			for (int j = 1; j < i; j++) pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
			pascal[i][i] = 1;
		}
		
		visited = new boolean[n+1];
		output = new int[n];
		solution(0, 0);
		for (int i = 0; i < n; i++) sb.append(output[i]).append(" ");
		System.out.println(sb);
		br.close();
	}
	
	static boolean solution(int idx, int res) {
		if (idx >= n) {
			if (res == f) return true;
			return false;
		}
		
		for (int i = 1; i <= n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				if (solution(idx+1, res + i*pascal[n-1][idx])) {
					output[idx] = i;
					return true;
				};
				visited[i] = false;
			}
		}
		return false;
	}
}