import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()), answer = 0, f1 = 0, f2 = 0, cnt = 0, idx = 0;
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (f1 == 0) f1 = arr[i];
			else if (f1 != arr[i] && f2 == 0) f2 = arr[i];
			else if (f1 != arr[i] && f2 != arr[i]) {
				answer = Math.max(answer, cnt);
				cnt = i - idx;
				f1 = arr[idx];
				f2 = arr[i];
			}
			
			if (arr[i] == f1 || arr[i] == f2) {
				cnt++;
				if (i > 0 && arr[i-1] != arr[i]) idx = i;
			}
		}
		answer = Math.max(answer, cnt);
		System.out.println(answer);
		br.close();
	}
}