import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	static ArrayList<Integer> b = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) b.add(Integer.parseInt(st.nextToken()));
		b.sort(null);

		for (int i = 0; i < n; i++) {
			int m = binSearch(a[i]);
			if (m > 0) sb.append(m).append(" ");
			else break;		
		}
		
		if (!b.isEmpty())System.out.println(-1);
		else System.out.println(sb);
		br.close();
	}
	
	static int binSearch(int min) {
		int l = 0, r = b.size()-1, mid;
		while (l <= r) {
			mid = (l + r) / 2;
			if (min > b.get(mid)) l = mid+1;
			else r = mid - 1;
		}
		if (l < b.size() && b.get(l) >= min) return b.remove(l);
		return 0;
	}
}