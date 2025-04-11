import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine()) % 100, answer = 0;
		for (int i = 1; i < 5 && m > 0; i++) {
			for (int j = 0; j < i && m > 0; j++) {
				m -= 5;
				answer++;
			}
			if (m <= 0) break;
			for (int j = 0; j < i && m > 0; j++) {
				m -= 5;
				if (m >= 0) answer--;
			}
		}
		
		System.out.println(answer);
		br.close();
	}
}