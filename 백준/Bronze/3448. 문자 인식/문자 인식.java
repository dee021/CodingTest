import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		String line;
		double length, error, ans;
		for (int t = 0; t < tc; t++) {
			length = 0;
			error = 0;
			while (true) {
				line = br.readLine().strip();
				if (line.isEmpty()) break;
				length += line.length();
				for (char c:line.toCharArray()) {
					if (c=='#') error++;
				}
			}
			ans = (length - error)/length * 100;
			ans = Math.round(ans*10)/10.0;
			if (ans == Math.round(ans))
				System.out.println("Efficiency ratio is "+Math.round(ans)+"%.");
			else
				System.out.println("Efficiency ratio is "+ans+"%.");
		}	
	}	
}
