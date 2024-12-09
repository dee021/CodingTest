import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer = 0;
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
		int x0 = x, y0 = y;
		for (int i = 1; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken());
			answer += Math.abs(x-u) + Math.abs(y-v);
			x = u; y = v;
		}
		System.out.println(answer + Math.abs(x-x0) + Math.abs(y-y0));
		br.close();
	}	
}