import java.math.*;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static String ans;
	static int a, r, p1, p2;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			a = Integer.parseInt(st.nextToken());
			p1 = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine(), " ");
			r = Integer.parseInt(st.nextToken());
			p2 = Integer.parseInt(st.nextToken());
			if (a/p1 > r*r*Math.PI/p2)
				ans = "Slice of pizza";
			else
				ans = "Whole pizza";
			System.out.println(ans);
		}
	}
}