import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			if (check(br.readLine().strip())) System.out.println("YES");
			else System.out.println("NO");
		}
		
		br.close();
	}
	
	private static boolean check(String str) {
		if (str == "") return true;
		if (str.startsWith("01")) {
			if (check(str.substring(2))) return true;
		}
		
		if (str.startsWith("100")) {
			int idx = 3;
			while (idx < str.length()-1 && str.charAt(idx) == '0') idx++;
			while (idx < str.length() && str.charAt(idx) == '1') if (check(str.substring(++idx))) return true;
		}
		return false;
	}
}