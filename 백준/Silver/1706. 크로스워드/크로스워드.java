import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int r = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
		char[][] puzzle = new char[r][];
		ArrayList<String> word = new ArrayList();
		String input;
		for (int i = 0; i < r; i++) {
			input = br.readLine().strip();
			puzzle[i] = input.toCharArray();
			
			for (String s:input.split("#")) {
				if (s.length() > 1) word.add(s);
			}
		}
		
		for (int i = 0; i < c; i++) {
			sb.setLength(0);
			for (int j = 0; j < r; j++) {
				if (puzzle[j][i] == '#') {
					if (sb.length() > 1) word.add(sb.toString());
					sb.setLength(0);
				} else sb.append(puzzle[j][i]);
			}
			if (sb.length() > 1) word.add(sb.toString());
		}
		
		Collections.sort(word);
		System.out.println(word.get(0));
		br.close();
	}
}