import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()), k = Integer.parseInt(br.readLine()), x, y;

		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			x = Integer.parseInt(st.nextToken())-1;
			y = Integer.parseInt(st.nextToken())-1;
			x = Math.min(x, n-1-x);
			y = Math.min(y, n-1-y);
			switch (Math.min(x, y)%3) {
			case 0: sb.append(1).append("\n");break;
			case 1: sb.append(2).append("\n");break;
			case 2: sb.append(3).append("\n");break;
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}