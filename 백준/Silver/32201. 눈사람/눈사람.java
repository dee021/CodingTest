import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine()), maxDiff = -n, diff;
		long player;
		Map<Long, Integer> order = new HashMap();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n ; i++) {
			order.put(Long.parseLong(st.nextToken()), i);
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			player = Long.parseLong(st.nextToken());
			diff = order.get(player) - i;
			if (diff > maxDiff) {
				sb.delete(0, sb.length());
				sb.append(player + " ");
				maxDiff = diff;
			} else if (diff == maxDiff) sb.append(player + " ");
		}
		
		System.out.println(sb);
		br.close();
	}
}