import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int min = 1_000_000, u, d, l, r, mid, res;
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			u = Integer.parseInt(st.nextToken()); d = Integer.parseInt(st.nextToken());
			l = 0; r = n;
			while (l <= r) {
				mid = (l+r)/2;
				res = u*mid - d*(n-mid);
				if (res <= 0) l = mid+1;
				else {
					r = mid-1;
					min = Math.min(min, res);
				}
			}
		}
		System.out.println(min);

		br.close();
	}	
}