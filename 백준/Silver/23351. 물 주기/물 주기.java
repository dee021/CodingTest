import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		int idx = 0, l = n/a, cnt = 0;
		int[] arr = new int[l];
		Arrays.fill(arr, k);
		boolean flag = true;
		while (flag) {
			cnt++;
			for (int i = 0; i < l; i++) {
				if (i == idx) arr[i] += b;
				arr[i]--;
				if (arr[i] == 0) flag = false;
			}
			idx = (idx+1)%l;
		}
		System.out.println(cnt);
		br.close();
	}
}