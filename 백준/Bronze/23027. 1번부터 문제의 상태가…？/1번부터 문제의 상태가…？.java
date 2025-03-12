import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().strip();
		int l = input.length();
		int a = input.indexOf('A'), b = input.indexOf('B'), c = input.indexOf('C');
		if (a != -1) input = input.replaceAll("[B-DF]", "A");
		else if (b != -1) input = input.replaceAll("[CDF]", "B");
		else if (c != -1) input = input.replaceAll("[DF]", "C");
		else {
			input = "";
			for (int i = 0; i < l; i++) input+='A';
		}
		
		System.out.println(input);
		br.close();
	}
}