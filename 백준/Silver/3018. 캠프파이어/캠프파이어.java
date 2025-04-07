import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine()), d = Integer.parseInt(br.readLine()), k, s = -1;
		boolean[][] arr = new boolean[n+1][d];
		boolean[] syncSong;
		boolean isInSY;
		for (int i = 0; i < d; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			k = Integer.parseInt(st.nextToken());
			isInSY = false;
			int[] tmp = new int[k];
			for (int j = 0; j < k; j++) {
				tmp[j] = Integer.parseInt(st.nextToken());
				if (tmp[j] == 1) isInSY = true;
			}
			
			if (isInSY) {
				s++;
				for (int j = 0; j < k; j++) arr[tmp[j]][s] = true;
			}
			else if (s >= 0) {
				syncSong = new boolean[s+1];
				for (int j = 0 ; j <= s; j++) {
					for (int p = 0; p < k; p++)
						if (arr[tmp[p]][j]) {
							syncSong[j] = true;
							break;
						}
					if (syncSong[j]) for (int p = 0; p < k; p++) arr[tmp[p]][j] = true;
				}
			}
		}
		
		boolean flag;
		for (int p = 1; p < n +1; p++) {
			flag = true;
			for (int i = 0; i <= s; i++) {
				if (!arr[p][i]) {
					flag = false;
					break;
				}
			}
			if (flag) sb.append(p).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}