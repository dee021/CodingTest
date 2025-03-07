import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), s;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long cur = Integer.parseInt(st.nextToken()), sum = cur;
		
		for (int i = 0; i < n-1; i++) {
			s = Integer.parseInt(st.nextToken());
			if (s - sum > cur) cur = s - sum;
			sum += s;
		}

		System.out.println(cur);
		br.close();
	}
}