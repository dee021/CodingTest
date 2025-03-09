import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()), g, x, ans = 0, isOdd;
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");

		n--;
		g = Math.abs(Integer.parseInt(st1.nextToken()) - Integer.parseInt(st2.nextToken()));
		x = Integer.parseInt(st3.nextToken());
		ans = g/x;
		isOdd = ans%2;
		if (g%x != 0) ans = -1;
		while(n-- > 0 && ans > -1) {
			g = Math.abs(Integer.parseInt(st1.nextToken()) - Integer.parseInt(st2.nextToken()));
			x = Integer.parseInt(st3.nextToken());
			if (g%x != 0) {
				ans = -1;break;
			}
			if (isOdd != (g/x)%2) {
				ans = -1;break;
			}
			ans = Math.max(ans, g/x);
		}

		System.out.println(ans);
		br.close();
	}
}