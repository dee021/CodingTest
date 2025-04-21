import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), odds = 0, evens = 0;
		
		for (char c: br.readLine().toCharArray()) {
			if ((c-'0')%2 == 0) evens++;
			else odds++;
		}
		
		if (odds == evens) System.out.println(-1);
		else System.out.println(evens > odds?0:1);
		
		br.close();
	}
}