import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] answer = new int[10];
	static int ans = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < 10; i++) answer[i] = Integer.parseInt(st.nextToken());
		solution(0,0,0,0);
		System.out.println(ans);
		br.close();
	}
	
	static void solution(int idx, int pre, int cnt, int score) {
		if (idx > 9) {
			if (score >= 5) ans++;
			return;
		}
		
		if (10-idx+score < 5) return;
		
		for (int i = 1; i < 6; i++) {
			if (cnt == 2 && pre == i) continue;
			solution(idx+1, i, pre==i?cnt+1:1, answer[idx] == i?score+1:score);
		}
	}
}