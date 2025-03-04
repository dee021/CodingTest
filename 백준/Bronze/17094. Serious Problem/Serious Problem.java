import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine().strip();
		int t = 0, e = 0;
		for (char c : input.toCharArray()) {
			if (c == '2')t++;
			else e++;
		}
		
		System.out.println(t==e?"yee":(t>e?"2":"e"));
		br.close();
	}
}