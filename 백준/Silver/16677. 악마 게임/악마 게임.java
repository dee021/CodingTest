import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
		char[] word = br.readLine().toCharArray();
		int n = Integer.parseInt(br.readLine()), length = word.length, x = 1, y = 0;
		String answer = "No Jam";
        
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String input = st.nextToken();
			if (input.length() <= length) continue;
			int w = Integer.parseInt(st.nextToken());
			boolean gbs = (y * (input.length() - length)) < x * w;
			int idx = 0;
			boolean flag = false;
			for (char c: input.toCharArray()) {
				if (c == word[idx]) idx++;
				if (idx == length) {
					flag = true;
					break;
				}
			}
            
			if (flag && gbs) {
				x = input.length() - length;
				y = w;
				answer = input;
			}
		}
		
		System.out.println(answer);
		br.close();
	}
}