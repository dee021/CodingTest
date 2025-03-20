import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] dis = new int[n];
		for (int i = 0; i < n; i++) dis[i] = Integer.parseInt(br.readLine());
		char[] t = "A BC D EF G ".toCharArray();
		
		for (int i = 0; i < t.length-1; i++) {
			if (t[i] == ' ') continue;
			int idx = i;
			for (int d: dis) {
				while (idx + d < 0) idx += t.length;
				idx = (idx + d)%t.length;
				if (t[idx] == ' ') break;
			}
			if (t[idx] != ' ') System.out.println(t[i] + " " + t[idx]);
		}

		br.close();
	}
}