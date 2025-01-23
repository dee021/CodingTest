import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static char[][] board;
	static int[][] dr = {{0,1}, {1, 0}, {1, 1}, {1, -1}};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		board = new char[n][n];
		
		for (int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
		}

		System.out.println(search(n));

		br.close();
	}
	
	static String search(int n) {
		int cnt, x, y;
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < n; c++) {
				if (board[r][c] == '.') continue;
				for (int i = 0; i < 4; i++) {
					cnt = 1;
					y = r + dr[i][0];
					x = c + dr[i][1];
					while (y < n && 0 <= x && x < n && board[r][c] == board[y][x]) {
						cnt++;
						y += dr[i][0];
						x += dr[i][1];
						if (cnt >= 3) return board[r][c]+"";
					}
				}
			}
		}
		return "ongoing";
	}
}