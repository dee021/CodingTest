import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine()), price = 3000;
		int[][] stock = new int[6001][2]; 
		int p, x;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			p = Integer.parseInt(st.nextToken()) - 7000;
			x = Integer.parseInt(st.nextToken());
			if (st.nextToken().equals("1")) {
				if (stock[p][1] > 0) {
					price = p;
					if (stock[p][1] < x) stock[p][0] += x - Math.min(x, stock[p][1]);
					stock[p][1] -= Math.min(x, stock[p][1]);
				}
				else {
					stock[p][0] += x;
				}
			}
			else {
				if (stock[p][0] > 0) {
					price = p;
					if (stock[p][0] < x) stock[p][1] += x - Math.min(x, stock[p][0]);
					stock[p][0] -= Math.min(x, stock[p][0]);
				} else {
					stock[p][1] += x;
				}
			}
		}

		System.out.println(price + 7000);
		br.close();
	}
}