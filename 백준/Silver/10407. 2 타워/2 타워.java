import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/*
		 * h(1) mod 3 = 2 mod 3 = 2
		 * h(2) = 2^2 mod 3 = (2*2) mod 3 = 4 mod 3 = 1
		 * h(3) = (2^2)^2 mod 3 = ((2*2 mod 3) * (2*2 mod 3)) mod 3 = 1 mod 3 = 1
		 * ...
		 * => h(n) (n > 2) = 1
		*/
		
		String n = br.readLine();
		
		System.out.println(n.equals("1")?2:1);
		br.close();
	}
}