import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ans = new String();
		int score = Integer.parseInt(br.readLine());
		if (score >= 90)
			ans = "A";
		else if (score >= 80)
			ans = "B";
		else if (score >= 70)
			ans = "C";
		else if (score >= 60)
			ans = "D";
		else
			ans = "F";
		System.out.println(ans);
	}
}