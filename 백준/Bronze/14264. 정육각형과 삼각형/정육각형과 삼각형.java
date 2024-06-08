import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.*;

// s = root(3)*l * l*2 * 1/2

public class Main {
	static int input;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		input = Integer.parseInt(br.readLine());
		BigDecimal s = BigDecimal.valueOf(Math.sqrt(3)/4 * input * input);
		System.out.print(s);
	}
}
