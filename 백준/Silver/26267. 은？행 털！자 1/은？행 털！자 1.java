import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		long ans = 0;
		Map<Integer, Long> get = new HashMap<>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
			get.put(t-x, get.containsKey(t-x)?get.get(t-x) + c:c);
			ans = Math.max(ans, get.get(t-x));
		}
		
		System.out.println(ans);
		br.close();
	}
}