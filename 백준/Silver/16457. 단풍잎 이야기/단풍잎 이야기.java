import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int n, m, k;
	static int[][] skill;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		skill = new int[m][k];
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < k; j++) skill[i][j] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(branch(1, 0, 0));
		br.close();
	}
	
	static int branch(int start, int res, int dep) {
		int cnt = 0;
		
		for (int key = start; key < 2*n+1; key++) {
			if (dep + 1 < n) cnt = Math.max(cnt, branch(key, res | (1<<key), dep+1));
			else cnt = Math.max(cnt, check(res | (1<<key)));
		}
		return cnt;
	}
	
	static int check(int keys) {
		int cnt = m;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < k; j++) {
				if ((keys & 1<<skill[i][j]) != 1<<skill[i][j]) {
					cnt--;
					break;
				}
			}
		}
		return cnt;
	}
}