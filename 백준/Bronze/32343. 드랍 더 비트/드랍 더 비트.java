import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static BufferedReader br;
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken()), res = 0;
		
		if (x+y <= n) {
			res = ((1 << (x+y)) -1) << (n-x-y);
		} else {
			res = (1 << n) - (1 << (x+y - n));
		}

		System.out.println(res);

		br.close();
	}
}