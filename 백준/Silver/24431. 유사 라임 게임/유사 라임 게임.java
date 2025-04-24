import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		Set<String> word = new HashSet<>();
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken()), f = Integer.parseInt(st.nextToken()), answer = 0;
			word.clear();
			st = new StringTokenizer(br.readLine(), " ");
			
			while (n-- > 0) {
				String input = st.nextToken().substring(l-f);
				if (word.contains(input)) {
					word.remove(input);
					answer++;
				} else word.add(input);
			}
			sb.append(answer).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}