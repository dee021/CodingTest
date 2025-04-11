import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int n;
	static int[][] subject;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(br.readLine());
		subject = new int[n][];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int k = Integer.parseInt(st.nextToken());
			int[] table = new int[k];
			for (int j = 0; j < k; j++) table[j] = Integer.parseInt(st.nextToken());
			subject[i] = table;
		}
		
		int m = Integer.parseInt(br.readLine());
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int k = Integer.parseInt(st.nextToken());
			boolean[] stu = new boolean[51];
			for (int j = 0; j < k; j++) {
				stu[Integer.parseInt(st.nextToken())] = true;
			}
			sb.append(sol(stu)).append("\n");
		}
        
		System.out.println(sb);
		br.close();
	}
	
	static int sol(boolean[] stu) {
		int cnt = 0;
		boolean flag;
		for (int i = 0; i < n; i++) {
			flag = true;
			for (int j = 0; j < subject[i].length; j++) {
				if (!stu[subject[i][j]]) {
					flag = false;
					break;
				}
			}
			if (flag) cnt++;
		}
		return cnt;
	}
}