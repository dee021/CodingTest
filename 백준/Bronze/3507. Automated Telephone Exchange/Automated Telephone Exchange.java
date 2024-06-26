import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int ans;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int ate = Integer.parseInt(br.readLine());
		ans = 0;
        
		for (int i = 0; i < 100; i++) {
			if (ate - i < 100)
				ans += 1;
		}
		System.out.println(ans);
	br.close();
	}
}