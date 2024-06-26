import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
	static int ans;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		ans = 3;
		int a, b, c;
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		if (a > c) {
			int tmp = c;
			c = a;
			a = tmp;
		}
		if (b > c) {
			int tmp = c;
			c = b;
			b = tmp;
		}
		
		if (a + b == c)
			ans = 1;
		else if (a * b == c)
			ans = 2;
		System.out.println(ans);
	}
}