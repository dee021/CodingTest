import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int h, w;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		h = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(br.readLine()), max = 0;
		int[][] sticker = new int[n][2];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 2; j++) sticker[i][j] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) max = Math.max(max, solution(sticker[i][0], sticker[i][1], sticker[j][0], sticker[j][1]));
		}
		
		System.out.println(max);
		br.close();
	}
	
	static int solution(int h1, int w1, int h2, int w2) {
		int res = h1*w1 + h2*w2;
		if (h1 + h2 <= h && Math.max(w1, w2) <= w) return res;
		if (h1 + h2 <= w && Math.max(w1, w2) <= h) return res;
		if (Math.max(h1, h2) <= h && w1 + w2 <= w) return res;
		if (Math.max(h1, h2) <= w && w1 + w2 <= h) return res;
		
		if (h1 + w2 <= w && Math.max(h2, w1) <= h) return res;
		if (Math.max(h1, w2) <= w && h2 + w1 <= h) return res;
		if (h1 + w2 <= h && Math.max(h2, w1) <= w) return res;
		if (Math.max(h1, w2) <= h && h2 + w1 <= w) return res;
		
		return 0;
	}
}