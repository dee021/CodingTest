import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static char[][] adjShape = {
			{'0','0'},{'4','5'},{'0','0'},{'4','5'},{'2','3'},{'8','0'},{'2','3'},{'8','0'},{'6','7'}
	};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line;
		int tc = 0;
		while (!(line = br.readLine()).equals("0")) {
			sb.append(++tc);
			if (!line.startsWith("1") || !line.endsWith("2")) sb.append(". NOT\n");
			else sb.append(blockMatch(line.toCharArray()));
		}

		System.out.println(sb);
		br.close();
	}
	
	private static String blockMatch(char[] block) {
		for (int i = 0; i < block.length-1; i++) {
			if (block[i+1] != adjShape[block[i] - '0'][0] && block[i+1] != adjShape[block[i] - '0'][1]) return ". NOT\n";
		}
		return ". VALID\n";
	}
}