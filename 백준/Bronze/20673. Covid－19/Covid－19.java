import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static String ans;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int p = Integer.parseInt(br.readLine());
		int q = Integer.parseInt(br.readLine());

		if (p <= 50 && q <= 10)
			ans = "White";
		else if (q > 30)
			ans = "Red";
		else
			ans = "Yellow";
		System.out.print(ans);
	}
}