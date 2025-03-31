import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int n, prev_key, key, sum, result;
		HashMap<Integer, Integer> map = new HashMap();
		while (true) {
			st = new StringTokenizer(br.readLine(), " ");
			n = Integer.parseInt(st.nextToken());
			if (n == 0) break;
			map.clear();
			sum = 0;
			for (int i = 0; i < n; i++) {
				key = Integer.parseInt(st.nextToken());
				sum += key;
				map.put(key, sum);
			}
			map.put(-10001, 0);
			map.put(10001, sum);
			
			st = new StringTokenizer(br.readLine(), " ");
			n = Integer.parseInt(st.nextToken());
			sum = 0;result = 0;key = 0;
			prev_key = -10001;
			for (int i = 0; i < n; i++) {
				key = Integer.parseInt(st.nextToken());
				sum += key;
				if (map.containsKey(key)) {
					result += Math.max(map.get(key) - map.get(prev_key), sum);
					prev_key = key;
					sum = 0;
				}
			}
			result += Math.max(map.get(10001) - map.get(prev_key), sum);
			sb.append(result).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}