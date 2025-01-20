import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 0, s = 0, isN = 0, max = 0;
		br.readLine();
		String stick = br.readLine();
		for (char c: stick.toCharArray()) {
			if (c == 'N') {
				if (isN == 0) {
					max = Math.max(max, Math.min(n, s));
					isN = 1;
					n = 0;
				}
				n++;
			} else {
				if (isN == 1) {
					max = Math.max(max, Math.min(n, s));
					isN = 0;
					s = 0;
				}
				s++;
			}
		}
		System.out.println(Math.max(max, Math.min(n, s))*2);

		br.close();
	}	
}