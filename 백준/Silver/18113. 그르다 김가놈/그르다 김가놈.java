import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		long l = 1, r = -1;
		ArrayList<Long> arr = new ArrayList();
		
		for (int i = 0; i < n ; i++) {
			long len = Long.parseLong(br.readLine());
			if (len <= k) continue;
			else if (len < 2*k) arr.add(len-k);
			else if (len > 2*k) arr.add(len - 2*k);
			if (!arr.isEmpty()) r = Math.max(r, arr.get(arr.size()-1));
		}
		
		long mid, cnt;
		while (l <= r) {
			mid = (l+r)/2;
			cnt = 0;
			for (int i = 0; i < arr.size(); i++) cnt += arr.get(i)/mid;
			if (cnt < m) r = mid -1;
			else l = mid +1;
		}
		
		System.out.println(r > 0? r:-1);
		br.close();
		
	}
}