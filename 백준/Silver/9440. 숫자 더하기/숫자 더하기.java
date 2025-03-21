import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n, zero;
		PriorityQueue<Character> pq = new PriorityQueue();
		StringBuilder sb = new StringBuilder(), x = new StringBuilder(), y = new StringBuilder();
		
		while (true) {
			n = Integer.parseInt(st.nextToken());
			if (n == 0) break;
			x.setLength(0);y.setLength(0);zero = 0;
			for (int i = 0; i < n; i++)
				pq.add(st.nextToken().charAt(0));

			for (int i = 0; i < n; i++) {
				if (pq.peek() == '0') {
					zero++;
					pq.poll();
				}
				else if (i%2 == 0) x.append(pq.poll());
				else y.append(pq.poll());
			}
			
			while (zero-- > 0) {
				if (Integer.parseInt(x.toString()) > Integer.parseInt(y.toString())) y.insert(1, 0);
				else x.insert(1, 0);
			}
			sb.append(Integer.parseInt(x.toString()) + Integer.parseInt(y.toString())).append("\n");
			st = new StringTokenizer(br.readLine(), " ");
		}

		System.out.println(sb);
		br.close();
	}
}