import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int n;
	static char[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		n = Integer.parseInt(br.readLine());
		arr = new char[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) arr[i] = st.nextToken().charAt(0);
		
		
		System.out.println(sol(sb));

		br.close();
	}
	
	static String sol(StringBuilder sb) {
		String res;
		if (sb.length() > 13 || sb.length() == 13 && !sb.toString().equals("1000000000000")) return "";
		for (int i = 0; i < n; i++) {
			sb.append(arr[i]);
			if (!isPrime(sb.toString())) {
				return "YES\n" + sb.toString();
			}
			res = sol(sb);
			if (res.startsWith("Y")) return res;
			sb.deleteCharAt(sb.length()-1);
		}
		return "NO";
	}
	
	static boolean isPrime(String number) {
		long k = Long.parseLong(number);
		if (k <= 1 || k > 1000000000000L) return false;
		if (k%2 == 0) {
			if (k == 2) return true;
			return false;
		}
		for (int i = 3; i*i <= k; i+=2) if (k%i == 0) return false;
		return true;
	}
}