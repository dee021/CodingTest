import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static int n;
	private static long[] spot;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken()), s, e;
		st = new StringTokenizer(br.readLine(), " ");
		spot = new long[n+2];
		spot[n+1] = 1_000_000_001;
		for (int i = 1; i < n+1; i++) spot[i] = Long.parseLong(st.nextToken());
		Arrays.sort(spot);
		
		for (int i =0 ; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			s = Integer.parseInt(st.nextToken());
			e = Integer.parseInt(st.nextToken());
			int end = binSearch(e), start = binSearch(s);
			if (e >= spot[end]) end++;
			if (s > spot[start]) start++;
			sb.append(end - start).append("\n");

		}

		System.out.println(sb);
		br.close();
	}
	
	private static int binSearch(int v) {
		int l = 0, r = n-1, mid;
		while (l <= r) {
			mid = (l + r) / 2;
			if (spot[mid] == v) return mid;
			if (spot[mid] < v) l = mid+1;
			else r = mid - 1;
		}
		return l;
	}
}