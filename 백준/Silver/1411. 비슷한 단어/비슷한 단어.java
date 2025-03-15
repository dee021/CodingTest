import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> count = new HashMap();
		HashMap<Character, Integer> ptn = new HashMap();
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()), idx = 0, p;
		String[] pattern = new String[n];
		
		for (int i = 0; i < n; i++) {
			p = 0;
			ptn.clear();
			sb.setLength(0);
			for (char c:br.readLine().strip().toCharArray()) {
				if (!ptn.containsKey(c)){
					p++;
					ptn.put(c, p);
				}
				sb.append(ptn.get(c));
			}
			if (count.containsKey(sb.toString())) count.put(sb.toString(), count.get(sb.toString())+1);
			else {
				count.put(sb.toString(), 1);
				pattern[idx++] = sb.toString();
			}
		}
		
		int res = 0, cnt; 
		for (int i = 0; i < idx; i++) {
			cnt = count.get(pattern[i]);
			res += cnt*(cnt-1)/2;
		}
		System.out.println(res);
		br.close();
	}
}