import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int r = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
		char[][] crossword = new char[r][c];
		String word;
		ArrayList<String> words = new ArrayList<>();
		for (int i = 0; i < r; i++) {
			word = br.readLine();
			int j = 0;
			for (char w: word.toCharArray()) crossword[i][j++] = w;
			for (String w:word.split("#")) {
				if (w.length() > 1) words.add(w);
			}
		}
		
		for (int i = 0; i < c; i++) {
			word = "";
			for (int j = 0; j < r; j++) {
				word += crossword[j][i];
			}
			for (String w:word.split("#")) {
				if (w.length() > 1) words.add(w);
			}
		}
		
		words.sort(Comparator.naturalOrder());
		System.out.println(words.remove(0));

		br.close();
	}	
}