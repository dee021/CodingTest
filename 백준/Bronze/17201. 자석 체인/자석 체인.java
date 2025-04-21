import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		char[] input = br.readLine().toCharArray();
		String answer = "Yes";
		
		for (int i = 0; i < 2*n-2; i+=2) {
			if (input[i] != input[i+2]) {
				answer = "No";
				break;
			}
		}
		
		System.out.println(answer);
		br.close();
	}
}