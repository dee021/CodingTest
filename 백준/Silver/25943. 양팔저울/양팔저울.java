import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int left = Integer.parseInt(st.nextToken()), right = Integer.parseInt(st.nextToken());

		while (st.hasMoreTokens()) {
			if (left > right) right += Integer.parseInt(st.nextToken());
			else left += Integer.parseInt(st.nextToken());
		}
		int diff = Math.abs(right-left), ans = 0, idx = 0;
		int[] weights = {100, 50, 20, 10, 5, 2, 1};
		while (diff > 0) {
			ans += diff/weights[idx];
			diff %= weights[idx];
			idx++;
		}
		
		System.out.println(ans);
		br.close();
	}
}