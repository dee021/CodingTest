import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {
	static int r, c;
	static int[][] arr, visited, d;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		arr = new int[r][c];
		visited = new int[r][c];
		
		for (int i = 0; i < r; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < c; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
			Arrays.fill(visited[i], Integer.MAX_VALUE);
		}
		
		int n = Integer.parseInt(br.readLine()), dy, dx;
		d = new int[n][];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			dy = Integer.parseInt(st.nextToken());
			dx = Integer.parseInt(st.nextToken());
			d[i] = new int[] {dy, dx};
		}
		
		System.out.println(bfs());
		br.close();
	}
	
	static int bfs() {
		ArrayDeque<Integer[]> ad = new ArrayDeque<>();
		for (int i = 0; i < c; i++) if (arr[0][i] == 1) {
			visited[0][i] = 0;
			ad.add(new Integer[]{0, i});
		}
		
		Integer[] tmp;
		int x, y, dx, dy, u, v;
		while (!ad.isEmpty()) {
			tmp = ad.poll();
			y = tmp[0]; x = tmp[1];
			for (int i = 0; i < d.length; i++) {
				dy = d[i][0]; dx = d[i][1];
				u = x + dx; v = y + dy;
				if (0 <= u && u < c && 0 <= v && v < r && arr[v][u] == 1 && visited[v][u] == Integer.MAX_VALUE) {
					visited[v][u] = visited[y][x] + 1;
					ad.add(new Integer[] {v, u});
					if (v == r-1) return visited[v][u];
				}
			}
		}
		return -1;
	}
}