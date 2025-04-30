import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// dy, dx
		int[][] size = {{0, 3}, {3,0},
				{1,1},
				{2, 1}, {1,2}, {2, 1}, {1,2},
				{2,1}, {1, 2}, {2,1}, {1,2},
				{2,1}, {1,2},
				{2,1}, {1,2},
				{1,2}, {2, 1}, {1, 2}, {2, 1}};
		
		int[][][] shape = {{{0,0}, {0,1}, {0,2}, {0,3}},
				{{0,0}, {1,0}, {2,0}, {3,0}},
				
				{{0,0}, {0,1}, {1,0}, {1,1}},
				
				{{0,0}, {1,0}, {2,0}, {2,1}},
				{{0,0}, {0,1}, {0,2}, {1,0}},
				{{0,0}, {0,1}, {1,1}, {2,1}},
				{{0,2}, {1, 0}, {1,1}, {1,2}},
				
				{{2, 0}, {2,1}, {1,1}, {0,1}},
				{{0,0}, {0,1}, {0,2}, {1,2}},
				{{0,0}, {0,1}, {1,0}, {2,0}},
				{{0,0}, {1,0}, {1,1}, {1,2}},
				
				{{0,0}, {1,0}, {1,1}, {2,1}},
				{{1,0}, {1,1}, {0,1}, {0,2}},
				
				{{0,1}, {1,1}, {1,0}, {2,0}},
				{{0,0}, {0,1}, {1,1}, {1,2}},
				
				{{0,0}, {0,1}, {0,2}, {1,1}},
				{{0,1}, {1,0}, {1,1}, {2,1}},
				{{0,1}, {1,0}, {1,1}, {1,2}},
				{{0,0}, {1,0}, {2,0}, {1,1}}};
				
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), max = 0;
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < m; j++) arr[i][j] = Integer.parseInt(st.nextToken());
		}
		
		for (int y = 0; y < n; y++) {
			for (int x = 0; x < m; x++) {
				for (int s = 0; s < size.length; s++) {
					if (y + size[s][0] < n && x + size[s][1] < m) {
						int sum = 0;
						for (int i = 0; i < 4; i++) sum += arr[y + shape[s][i][0]][x + shape[s][i][1]];
						max = Math.max(max, sum);
					}
				}
			}
		}
		
		System.out.println(max);
		br.close();
	}
}