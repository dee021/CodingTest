import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int answer = 0, last = 30;
		for (int i = 0; i < n; i++) {
			int time = Integer.parseInt(br.readLine());
			if (last >= time) {
				answer++;
				last -= time;
			}
			else {
				if (last >= time/2.0) answer++;
				last = 0;
			}
			if (last == 0) last = 30;
		}
		System.out.println(answer);
		br.close();
	}	
}