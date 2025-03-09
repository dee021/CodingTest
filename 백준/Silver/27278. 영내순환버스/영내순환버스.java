import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int[] time = new int[n+1];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i <n ;i++) time[i+1] = time[i] + Integer.parseInt(st.nextToken());
		
		int max = 0;
		int in, out, t, tmp;
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			in = Integer.parseInt(st.nextToken());
			out = Integer.parseInt(st.nextToken());
			t = Integer.parseInt(st.nextToken());
			tmp = t/time[n]*time[n]+time[in-1]; // 타는 시간
			if (t > tmp) tmp += time[n];
			max = Math.max(max, tmp + time[out-1] - time[in-1] + (in < out? 0:time[n]));
		}
		System.out.println(max);
		br.close();
	}
}