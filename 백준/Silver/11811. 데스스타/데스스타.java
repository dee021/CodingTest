import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());	
		int[] min = new int[n];
		int[][] arr = new int[n][n];
		
		for (int i = 0; i < n ; i++) {
			int m = 0;
			st = new StringTokenizer(br.readLine(), " "); 
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				m = Math.max(m, arr[i][j]);
			}
			min[i] = m;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) continue;
				if ((min[i] & min[j]) != arr[i][j]) {
					for (int e = 0; e < 30; e++) {
						if ((arr[i][j] & (1<<e)) == (1<<e) && (min[i] & (1<<e)) == 0)
							min[i] = (min[i] | (1<<e));
					}
				}
			}
		}
		
		for (int i = 0; i < n; i++) sb.append(min[i]).append(" ");
		
		System.out.println(sb);
		br.close();
	}
}