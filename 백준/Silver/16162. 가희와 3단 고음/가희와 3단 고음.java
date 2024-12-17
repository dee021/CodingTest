import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
		int ans = 0, cur = a;
		st = new StringTokenizer(br.readLine(), " ");
		for (int i =0; i < n; i++) {
			if (cur == Integer.parseInt(st.nextToken())) {
				cur += d;
				ans++;
			}
		}
		
		System.out.println(ans);

		br.close();
	}	
}