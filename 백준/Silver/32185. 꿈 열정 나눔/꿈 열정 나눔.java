import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static BufferedReader br;
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int[][] vps = new int[n][2];
		int jw = 0, idx = 0, team;
		st = new StringTokenizer(br.readLine(), " ");
		while (st.hasMoreTokens()) jw += Integer.parseInt(st.nextToken());
		
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			team = 0;
			while (st.hasMoreTokens()) team += Integer.parseInt(st.nextToken());
			if (jw >= team) {
				vps[idx][0] = team;
				vps[idx++][1] = i;
			}
		}
		
		Arrays.sort(vps, (elem1, elem2) -> elem2[0] - elem1[0]);
		
		StringBuilder sb = new StringBuilder();
		sb.append(0 + " ");
		idx = 0;
		while (idx < n && vps[idx][1] > 0 && --m > 0) {
			sb.append(vps[idx++][1] + " ");
		}
		System.out.println(sb);

		br.close();
	}
}