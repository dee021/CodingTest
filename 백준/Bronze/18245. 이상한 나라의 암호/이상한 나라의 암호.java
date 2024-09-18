import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final String END = "Was it a cat I saw?";
		int line = 0;
		String s;
		while(true) {
			line++;
			s = br.readLine().strip();
			if (s.equals(END)) break;
			for (int i = 0; i < s.length(); i = i + line + 1 ) System.out.print(s.charAt(i));
			System.out.println();
		}
	}
}