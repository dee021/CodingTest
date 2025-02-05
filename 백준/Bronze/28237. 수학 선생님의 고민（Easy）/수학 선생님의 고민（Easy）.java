import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static BufferedReader br;
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().strip()), c, d;
		boolean flag = false;
		
		for (int a = 1; a <= n; a++) {
			if (n%a == 0) {
				c = n/a;
				for (int b = 1; b <= 5000; b++) {
					if ((-n-2)%b == 0) {
						d = (-n-2)/b;
						if (a*d + b*c == n+1) {
							flag = true;
							System.out.println(a + " " + b + " " + c + " " + d);
						}
							
					}
				}
			}
		}
		
		if (!flag)
			System.out.println(-1);

		br.close();
	}
}