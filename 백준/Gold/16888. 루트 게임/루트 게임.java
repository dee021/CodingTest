import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		boolean[] game = new boolean[1000001];
		int b = 0;
		for (int i = 1; i < 1000001; i++) {
			if ((b+1)*(b+1) == i) {
				b++;
				game[i] = true;
				continue;
			}
			for (int j = 1; j < b+1; j++) {
				if (!game[i-j*j]) {
					game[i] = true;
					break;
				}
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			if (game[Integer.parseInt(br.readLine())]) sb.append("koosaga\n");
			else sb.append("cubelover\n");
		}

		System.out.println(sb);
		br.close();
	}
}