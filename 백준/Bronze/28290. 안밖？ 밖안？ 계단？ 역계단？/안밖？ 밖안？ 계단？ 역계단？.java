import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static BufferedReader br;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().strip(), ans;
		
		switch(input) {
		case "fdsajkl;":
		case "jkl;fdsa":
			ans = "in-out";
			break;
		case "asdf;lkj":
		case ";lkjasdf":
			ans = "out-in";
			break;
		case "asdfjkl;":
			ans = "stairs";
			break;
		case ";lkjfdsa":
			ans = "reverse";
			break;
		default:
			ans = "molu";
		}
		
		System.out.println(ans);

		br.close();
	}
}