import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static int n;
	private static long[][] spot;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
	    StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		spot = new long[n][2];
		
		for (int i = 0; i < n ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			spot[i][0] = Integer.parseInt(st.nextToken());
			spot[i][1] = Integer.parseInt(st.nextToken());
		}
		
		int q = Integer.parseInt(br.readLine());
		for (int i = 0; i < q; i++) sb.append(bin_search(Double.parseDouble(br.readLine())) + "\n");

		System.out.println(sb);
		br.close();
		
	}
	
	private static int bin_search(double x) {
		int l = 0, r = n-2, mid;
		while (l <= r) {
			mid = (l+r)/2;
			if (spot[mid][0] < x && x < spot[mid+1][0]) {
				if (spot[mid][1] < spot[mid+1][1]) return 1;
				else if (spot[mid][1] > spot[mid+1][1]) return -1;
				return 0;
			}
			if (spot[mid][0] > x) r = mid -1;
			else l = mid +1;
		}
		return 0;
	}
}