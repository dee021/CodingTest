import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken()), front = 0;
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			switch(st.nextToken()) {
			case "1": {
				int idx = Integer.parseInt(st.nextToken()) - 1, value = Integer.parseInt(st.nextToken());
				idx += front;
				if (idx >= n) idx -=n;
				arr[idx] += value;
				break;
				}
			case "2": {
				front -= Integer.parseInt(st.nextToken());
				if (front < 0) front += n;
				break;
			}
			case "3": {
				front += Integer.parseInt(st.nextToken());
				if (front > n) front -= n;
				break;
			}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = front; i < n; i++) sb.append(arr[i]).append(" ");
		for (int i = 0; i < front; i++) sb.append(arr[i]).append(" ");

		System.out.println(sb);
		br.close();
	}
}