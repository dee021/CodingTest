import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		int cnt = 0, M = 1234567;
		
		while (n > 0) {
			int len = String.valueOf(n).length();
			double t = Math.pow(10, len-1)-1;
			cnt += ((n - t) * len)%M;
            cnt %= M;
			n = (long)t/1L;
		}
		System.out.println(cnt);
		br.close();
	}
}