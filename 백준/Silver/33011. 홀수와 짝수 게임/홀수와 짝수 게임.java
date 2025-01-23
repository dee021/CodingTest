import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine()), n, odd, even;
		
		for (int i = 0; i < t; i++) {
			n = Integer.parseInt(br.readLine());
			odd = 0; even = 0;
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < n; j++) {
				if (Integer.parseInt(st.nextToken())%2 == 0) even++;
				else odd++;
			}
			if (odd != even && Math.max(odd,even) %2 == 1) System.out.println("amsminn");
			else System.out.println("heeda0528");
		}
		br.close();
	}
}