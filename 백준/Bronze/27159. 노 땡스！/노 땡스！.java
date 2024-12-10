import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int answer = 0, cur = -1, num;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			num = Integer.parseInt(st.nextToken());
			if (num -1 > cur) {
				answer += num;
			}
			cur = num;
		}
		System.out.println(answer);
		br.close();
	}	
}