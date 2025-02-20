import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int l = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken()), cnt = 0;
		int[][] ball = new int[n][2];
		for (int i = 0; i < n ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			ball[i][0] = Integer.parseInt(st.nextToken());
			ball[i][1] = st.nextToken().equals("R")? 1: -1;
		}
		
		Arrays.sort(ball, (elem1, elem2) -> elem1[0] - elem2[0]);
		
		for (int i = 1; i < t+1; i++) {
			for (int j = 0; j < n; j++) {
				ball[j][0] += ball[j][1];
				if (ball[j][0] == 0) ball[j][1] = 1;
				else if(ball[j][0] == l) ball[j][1] = -1;
				if (j > 0 && ball[j][1] == -1 && ball[j-1][0] >= ball[j][0]) {
					cnt++;
					ball[j-1][1] = -1;
					ball[j][1] = 1;
					if (ball[j-1][0] > ball[j][0]) {
						ball[j-1][0]--;
						ball[j][0]++;
					}
				}
			}
		}

		System.out.println(cnt);
		br.close();
	}
}