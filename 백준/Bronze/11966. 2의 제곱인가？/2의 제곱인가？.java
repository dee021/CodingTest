import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static String input;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		input = Integer.toBinaryString(Integer.parseInt(br.readLine()));
		if (input.replaceAll("0", "").equals("1"))
			System.out.println(1);
		else
			System.out.println(0);
	}
}