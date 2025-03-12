import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();

		int x = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		int[][] logs = new int[k][3];
		int[] student = new int[x+1], desk = new int[c+1];
		for (int i = 0; i < k; i++) logs[i] = Arrays.asList(br.readLine().strip().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		Arrays.sort(logs, (elem1, elem2) -> elem1[0] - elem2[0]);
		
		for (int[] log:logs) {
			if (desk[log[1]] == 0)  {
				if (student[log[2]] != 0) desk[student[log[2]]] = 0;
				student[log[2]] = log[1];
				desk[log[1]] = log[2];
			}
		}
		
		for (int i = 1; i <= x; i++) {
			if (student[i] != 0) sb.append(i + " " + student[i]).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}