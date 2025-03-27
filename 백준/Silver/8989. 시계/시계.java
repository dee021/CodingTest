import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int[][] time = new int[5][3];
		
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 5; j++) {
				String[] s = st.nextToken().split(":");
				time[j][1] = Integer.parseInt(s[0]);
				time[j][2] = Integer.parseInt(s[1]);
				time[j][0] = conv(time[j][1], time[j][2]);
			}
			Arrays.sort(time, (elem1, elem2) -> {
				for (int k = 0; k < 3; k++) {
					if (elem1[k] == elem2[k]) continue;
					return elem1[k] - elem2[k];
				}
				return 0;
			});
			sb.append(String.format("%02d:%02d\n", time[2][1], time[2][2]));
		}

		System.out.println(sb);
		br.close();
	}
	
	static int conv(int h, int m) {
		int hh = h%12*300 + m*5, mm = m*60;
		int degree = Math.abs(hh-mm);
		return Math.min(degree, 3600-degree);
	}
}