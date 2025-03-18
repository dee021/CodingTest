import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken());
		int cnt = n/a, ans = cnt;
		
		while (cnt > 0) {
			ans += cnt/a;
			cnt /= a;
		}
		
		System.out.println(ans);
		br.close();
	}
}