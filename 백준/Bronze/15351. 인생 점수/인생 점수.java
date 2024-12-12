import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s;
		int answer;
		
		for (int i = 0; i < n; i++) {
			s = br.readLine().strip();
			answer = 0;
			for (char c: s.toCharArray()) {
				if (c == ' ') continue;
				answer += c - 'A' + 1;
			}
			
			if (answer == 100) System.out.println("PERFECT LIFE");
			else System.out.println(answer);
		}

		br.close();
	}	
}