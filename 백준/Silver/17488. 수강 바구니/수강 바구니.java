import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int[] subject = new int[m+1];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i =1; i < m+1; i++) subject[i] = Integer.parseInt(st.nextToken());
		
		int s;
		
		boolean[][] answer = new boolean[n+1][m+1];
		int[] count = new int[m+1];
		int[][] stu = new int[n+1][m+1];
		for (int c = 0; c < 2; c++) {
			for (int i = 1; i < n+1; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				s = Integer.parseInt(st.nextToken());
				while (s != -1) {
					stu[i][s]++;
					count[s]++;
					s = Integer.parseInt(st.nextToken());
				}
			}
		
			for (int i = 1; i < m+1; i++) {
				if (subject[i] >= count[i]) {
					for (int j = 1; j < n+1; j++) {
						if (stu[j][i] == 1)answer[j][i] = true;
					}
				}
			}
		}
		
		boolean flag;
		for (int i = 1; i < n+1; i++) {
			flag = false;
			for (int j = 1; j < m+1; j++) if (answer[i][j]) {
				if (!flag) flag = true;
				sb.append(j).append(" ");
				}
			if (!flag)sb.append("망했어요");
			sb.append("\n");
			
		}

		System.out.println(sb);
		br.close();
	}
}