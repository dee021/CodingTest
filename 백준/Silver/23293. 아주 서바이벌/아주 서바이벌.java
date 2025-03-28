import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int cnt = 0, d = 0;
	static boolean[] denied;
	static StringBuilder logs = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int t = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken()), log, p, a, b;
		int[] player = new int[n+1];
		Arrays.fill(player, 1);
		int[][] item = new int[n+1][54];
		
		denied = new boolean[n+1];
		
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			log = Integer.parseInt(st.nextToken());
			p = Integer.parseInt(st.nextToken());
			switch (st.nextToken()) {
			case "M":
				a = Integer.parseInt(st.nextToken());
				player[p] = a;
				break;
			case "F":
				a = Integer.parseInt(st.nextToken());
				if (player[p] != a) deny(log, p, false);
				item[p][a]++;
				break;
			case "C":
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				if (item[p][a] == 0 || item[p][b] == 0) {
					deny(log, p, false);
				}
				if (item[p][a] > 0) item[p][a]--;
				if (item[p][b] > 0) item[p][b]--;
				break;
			case "A":
				a = Integer.parseInt(st.nextToken());
				if (player[p] != player[a]) deny(log, p, true);
				break;
			}
		}

		System.out.println(cnt);
		if (cnt > 0) System.out.println(logs);
		System.out.println(d);
		if (d > 0) for (int i = 1; i < n+1; i++) if (denied[i])System.out.print(i + " ");
		br.close();
	}
	
	static void deny(int log, int p, boolean flag) {
		cnt++;
		logs.append(log).append(" ");
		if (flag && !denied[p]) {
			d++;
			denied[p] = true;
		}
	}
}