import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), h = 0, d = 0;
		
		if (n > 0)
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			h += Integer.parseInt(st.nextToken())+1;
		}
		
		if (m > h) {
			int l = m - h;
			if (l <= n+1) d = l;
			else {
				int k = l/(n+1);
				d += k*(k+1)*(2*k+1)/6*(n+1);
				k++;
				d += (k*k) * (l%(n+1));
			}
		}
		System.out.println(d);
		br.close();
	}
}