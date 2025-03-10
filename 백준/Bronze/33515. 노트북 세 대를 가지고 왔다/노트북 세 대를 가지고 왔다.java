import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int t0 = Integer.parseInt(st.nextToken()), t1 = Integer.parseInt(st.nextToken());
		System.out.println(Math.min(t0, t1));
		br.close();
	}
}