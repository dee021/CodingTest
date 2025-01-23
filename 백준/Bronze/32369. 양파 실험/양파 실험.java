import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		int la = 1, lb = 1, tmp;
		
		for (int i = 0; i < n; i++) {
			la += a;
			lb += b;
			if (la < lb) {
				tmp = lb;
				lb = la;
				la = tmp;
			} else if (la == lb) lb--;
		}
		System.out.println(la + " " + lb);

		br.close();
	}
}