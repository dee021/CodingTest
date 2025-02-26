import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int q = Integer.parseInt(br.readLine()), a, m, res;		
		final double kw = 105.6/60;
        
		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			a = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			res = (int)Math.floor(kw*a*m/1000);
			sb.append(res).append("\n");
		}

		System.out.println(sb);
		br.close();
	}
}