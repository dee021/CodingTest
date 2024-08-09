import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	static long ans, tmp, a, b;
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		ans = 0;
		a = Integer.parseInt(st.nextToken());
		tmp = 1;
		for (int i = 0; i < n-1; i++) {
			b = Integer.parseInt(st.nextToken());
			if (a < b) tmp += 1;
			else {
				ans += tmp * (tmp + 1) / 2;
				tmp = 1;
			}
			a = b;
		}
		ans += tmp * (tmp + 1) / 2;
		System.out.println(ans);
	}
}