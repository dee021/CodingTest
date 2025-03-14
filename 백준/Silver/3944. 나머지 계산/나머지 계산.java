import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) sb.append(modular(br.readLine().split(" "))).append("\n");

		System.out.print(sb);
		br.close();
	}
	
	private static int modular(String[] strs) {
		int m = Integer.parseInt(strs[0]) - 1;
		int res = 0;
		for (char k:strs[1].toCharArray()) {
			res += (k - '0') % m;
		}
		return res%m;
	}
}