import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static final int A = 'A' - 0;
	static String input;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		input = br.readLine();
		for (int i = 0; i < input.length(); i++) {
			int c = input.charAt(i) - 3;
			if (c < A)
				c += 26;
			System.out.print((char)c);
		}
	}
}
