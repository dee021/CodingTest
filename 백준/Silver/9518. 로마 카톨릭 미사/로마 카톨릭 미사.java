import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static int r, s, ans = 0, sg = 0;
	private static int[][] arr;
	private static int[][] dr = {
			{-1, -1}, {-1, 0}, {-1, 1},
			{0, -1}, {0, 1},
			{1, -1}, {1, 0}, {1, 1}
	};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		r = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());
		arr = new int[r][s];
		
		for (int i = 0; i < r; i++) {
			String input = br.readLine().strip();
			int j = 0;
			for (char c:input.toCharArray()) arr[i][j++] = c == '.'?0:1;
		}
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < s; j++) {
				handshake(j, i, arr[i][j] == 0);
			}
		}
        
		System.out.println(ans + sg);
		br.close();
	}
	
	private static void handshake(int x, int y, boolean isEmpty) {
		int hs = 0;
		for (int i = 0; i < 8; i++) {
			int u = x + dr[i][1], v = y + dr[i][0];
			if (0 <= u && u < s && 0 <= v && v < r && arr[v][u] == 1) {
				if (!isEmpty && (dr[i][0] == -1 || dr[i][0] + dr[i][1] == -1)) continue;
				hs++; 
			}
		}
		if (isEmpty) sg = Math.max(sg, hs);
		else ans += hs;
	}
}