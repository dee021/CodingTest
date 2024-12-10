import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap();
		map.put("C", 0);
		map.put("S", 0);
		map.put("I", 0);
		map.put("A", 0);
		int n = Integer.parseInt(br.readLine());
		String sub; int cnt;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			sub = st.nextToken();
			map.put(sub, map.get(sub)+1);
		}
		System.out.println(map.get(br.readLine().strip()));
		br.close();
	}	
}