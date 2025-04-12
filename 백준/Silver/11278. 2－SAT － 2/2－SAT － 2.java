import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int n, m;
	static boolean[] var;
	static int[][] oper;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		var = new boolean[n+1];
		oper = new int[m][2];
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 2; j++) oper[i][j] = Integer.parseInt(st.nextToken());
		}
		
		if (branch(1)) {
			for (int i = 1; i < n+1; i++) sb.append(var[i]?1:0).append(" ");
			System.out.println(1);
			System.out.println(sb);
		} else System.out.println(0);

		br.close();
	}
	
	static boolean branch(int idx) {
		if (check()) return true;
		for (int i = idx; i < n+1; i++) {
			var[i] = true;
			if (branch(i+1)) return true;
			var[i] = false;
		}
		return false;
	}
	
	static boolean check() {
		for (int i = 0; i < m; i++) {
			if (!(getVariable(i, 0) || getVariable(i, 1))) return false;
		}
		return true;
	}
	
	static boolean getVariable(int y, int x) {
		if (oper[y][x] > 0) return var[oper[y][x]];
		return !var[-oper[y][x]];
	}
}