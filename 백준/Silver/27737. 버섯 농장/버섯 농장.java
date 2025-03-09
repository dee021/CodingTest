import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
	private static int[][] arr, dr = {{0,1}, {0,-1}, {1, 0}, {-1,0}};;
	private static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < n; j++) arr[i][j] = Integer.parseInt(st.nextToken());
		}
        
		int cnt = 0, res;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 0) {
					res = search(i, j);
					cnt += res/k;
					if (res%k > 0) cnt++;
				}
			}
		}
		
		if (cnt > 0 && m >= cnt) System.out.println("POSSIBLE\n"+(m - cnt));
		else System.out.println("IMPOSSIBLE");
		
		br.close();
	}
	
	private static int search(int r, int c) {
		ArrayDeque<int[]> arrDeq = new ArrayDeque();
		arrDeq.add(new int[] {r, c});
		arr[r][c] = 1;
		int cnt = 1, x, y;
		int[] tmp;
		while (!arrDeq.isEmpty()) {
			tmp = arrDeq.poll();
			y = tmp[0]; x = tmp[1];
			for (int i = 0; i < 4; i++) {
				r = y + dr[i][0];
				c = x + dr[i][1];
				if(0 <= r && r < n && 0 <= c && c < n && arr[r][c] == 0) {
					cnt++;
					arr[r][c] = 1;
					arrDeq.add(new int[] {r, c});
				}
			}
		}
		return cnt;
	}
}