import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		char[] pw = br.readLine().strip().toCharArray();
		boolean ans; String input;
		for (int i = 0; i < m; i++) {
			int idx = 0;
			ans = false;
			input = br.readLine().strip();
			for (char c: input.toCharArray()) {
				if (c == pw[idx]) idx++;
				if (idx >= n) {
					ans = true;
					break;
				}
			}
			sb.append(ans+"\n");
		}

		System.out.println(sb);
        br.close();

	}
}