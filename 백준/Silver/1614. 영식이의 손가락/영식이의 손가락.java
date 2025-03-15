import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int f = Integer.parseInt(br.readLine());
		long c = Integer.parseInt(br.readLine()), ans;

		switch(f) {
		case 1:
			ans = 8*c;
			break;
		case 5:
			ans = 8*c + 4;
			break;
		default:
			 if (c%2 == 1) ans = 8*(c/2 + 1) - f + 1;
			 else ans = 8*(c/2) + f - 1;
		}
		
		System.out.println(ans);
		br.close();
	}
}