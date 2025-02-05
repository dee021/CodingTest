import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static BufferedReader br;
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().strip();
		int[] arr = new int[input.length()+1];
		arr[0] = 0;
		int idx = 1, ans = 0;
		for (char k:input.toCharArray()) {
			arr[idx] = arr[idx++-1] + (k - '0');
		}
        
		int l, r;
		for (idx = 0; idx <= input.length(); idx++) {
			for (int len = (input.length() - idx)/2; len > 0; len--) {
				l = arr[idx + len] - arr[idx];
				r = arr[idx + 2*len] - arr[idx + len];
				if (l == r) ans = Math.max(ans, len);
			}
		}
		System.out.println(ans*2);

		br.close();
	}
}