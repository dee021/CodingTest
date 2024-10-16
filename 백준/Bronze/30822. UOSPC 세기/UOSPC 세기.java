import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt[] = new int[5];
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine().strip();
		char c;
		for (int i= 0; i < n; i++) {
			c = input.charAt(i);
			if (c == 'u') cnt[0]++;
			else if (c == 'o') cnt[1]++;
			else if (c == 's') cnt[2]++;
			else if (c == 'p') cnt[3]++;
			else if (c == 'c') cnt[4]++;
		}
	
	int ans = 1000;
	for (int i = 0; i < 5; i++) ans = Math.min(ans, cnt[i]);
	System.out.println(ans);
	}	
}