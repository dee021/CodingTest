import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int s = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int u = 0, o;
		
		for (int i =0; i <n+m; i++) {
			o = Integer.parseInt(br.readLine());
			if (o == 1) {
				if (s == u) s*=2;
				u++;
			} else u--;
		}
		System.out.println(s);

		br.close();
	}	
}