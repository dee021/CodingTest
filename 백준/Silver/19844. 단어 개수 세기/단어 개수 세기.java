import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str1 = "c', j', n', m', t', s', l', d', qu'".split(", ");
		String[] str2 = "a e i o u h".split(" ");
		String[] starts = new String[str1.length * str2.length];
		int cnt = 0, idx = 0;
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str2.length; j++) starts[idx++] = str1[i] + str2[j];
		}

		String[] input = br.readLine().strip().split(" ");
		for (String str:input) {
			for (String word:str.split("-")) {
				cnt++;
				for (String s:starts) {
					if (word.startsWith(s)) {
						cnt++;break;
					}
				}
			}
		}

		System.out.println(cnt);
		br.close();
	}
}