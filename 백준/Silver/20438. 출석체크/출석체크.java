import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		Set<Integer> sleep = new HashSet();
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n+3];
		Arrays.fill(arr, 1);
		arr[2] = 0;
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < k; i++) {
			sleep.add(Integer.parseInt(st.nextToken()));
		}
        
		st = new StringTokenizer(br.readLine(), " ");
		int no, d;
		for (int i = 0; i < q; i++) {
			no = Integer.parseInt(st.nextToken());
			d = 1;
            if (sleep.contains(no)) continue;
			while (no*d < n+3) {
				if (!sleep.contains(no*d)) arr[no*d] = 0;
				d++;
			}
		}
		
		for (int i = 3; i <= n+2; i++) {
			arr[i] += arr[i-1];
		}
		
		int s, e;
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			s = Integer.parseInt(st.nextToken());
			e = Integer.parseInt(st.nextToken());
			sb.append(arr[e] - arr[s-1]).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}