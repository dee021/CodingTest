import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		char[] str = "WelcomeToSMUPC".toCharArray();		
		System.out.println(str[(n-1)%str.length]);
		br.close();
	}
}