import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine().strip();
		int isUpper = 1, isLower = 1, isNumeric = 1, isSpecial = 1;
		for (char c : s.toCharArray()) {
			if ('a' <= c && c <= 'z') isLower = 0;
			else if ('A' <= c && c <= 'Z') isUpper = 0;
			else if ('0' <= c && c <= '9') isNumeric = 0;
			else isSpecial = 0;
		}
		System.out.println(Math.max(Math.max(6 - n, 0),(isLower + isUpper + isNumeric + isSpecial)));
        br.close();
	}	
}
