import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()), ans = 8, cnt = 1;

		while (cnt < n) {
			cnt *= 2;
			ans++;
		}

		System.out.println((cnt == n)?ans+2:ans+1);
		br.close();
	}
}