import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine()), w = 0, m = 0, diff = 0, count = 0;
		String line = br.readLine().strip();

		for (char g:line.toCharArray()) {
			if (g == 'M') m++;
			else w++;
			
			while (m > 0 && diff + 1 <= x) {
				m--;
				diff++;
				count++;
			}
			while (w > 0 && Math.abs(diff-1) <= x) {
				w--;
				diff--;
				count++;
			}
			if (m + w > 1) break;
		}

		System.out.println(count);
		br.close();
	}
}