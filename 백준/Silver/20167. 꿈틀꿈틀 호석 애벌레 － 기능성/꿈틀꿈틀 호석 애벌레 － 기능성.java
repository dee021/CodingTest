import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static int n, k, ans = 0;
	private static int[][] energy;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		energy = new int[n][2];
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		for (int i = 0; i < n ;i++) {
			int[] tmp = new int[] {i, arr[i]};
			while (tmp[0] + 1 < n && tmp[1] < k) {
				tmp[0]++;
				tmp[1] += arr[tmp[0]];
			}
			tmp[1] = tmp[1] >= k?tmp[1]-k:0;
			energy[i] = tmp;
		}
		
		bruteforce(-1, 0);
		System.out.println(ans);
		br.close();
	}
	
	private static void bruteforce(int idx, int res) {
		ans = Math.max(ans, res);
		
		for (int i = idx +1; i < n ;i++) {
			bruteforce(energy[i][0], res + energy[i][1]);
		}
	}
}