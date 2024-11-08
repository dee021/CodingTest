import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int time, name;
		int ans = 0; int solved = 0;
		int[] count = new int[26];
		String result;

		while (true) {
			st = new StringTokenizer(br.readLine(), " ");
			time = Integer.parseInt(st.nextToken());
			if (time == -1) break;
			name = st.nextToken().charAt(0) - 'A';
			result = st.nextToken();
			if (result.equals("right")) {
				ans += time + count[name] * 20;
				solved++;
				}
			else count[name]++;
		}
		
		System.out.println(solved + " " + ans);
		br.close();
	}	
}