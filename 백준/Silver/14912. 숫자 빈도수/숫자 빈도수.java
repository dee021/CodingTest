import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int ans = 0;
		int n = Integer.parseInt(st.nextToken());
		char d = st.nextToken().toCharArray()[0];
		
		for (int i = 1; i <= n; i++) {
			for (char k:(i+"").toCharArray()) if (k == d) ans++;
		}
		
		System.out.println(ans);
		br.close();
	}

}
