import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().strip(), output;

		if (input.contains("_")) System.out.println(cppToJava(input));
		else System.out.println(javaToCpp(input));
	}
	
	private static String javaToCpp(String str) {
		StringBuilder sb = new StringBuilder();
		char c;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c < '_') {
				if (i > 0) sb.append(("_" + c).toLowerCase());
				else return "Error!";
			}
			else sb.append(c);
		}
		return sb.toString();
	}
	
	private static String cppToJava(String str) {
		if (str.endsWith("_")) return "Error!";
		String[] strArr = str.split("_");
		StringBuilder sb = new StringBuilder();
		char c;
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].length() == 0) return "Error!";
			for (int j = 0; j < strArr[i].length(); j++) {
				c = strArr[i].charAt(j);
				if (c < '_') return "Error!";
				if (i > 0 && j == 0) sb.append(String.valueOf(c).toUpperCase());
				else sb.append(c);
			}
		}
		return sb.toString();
	}
}