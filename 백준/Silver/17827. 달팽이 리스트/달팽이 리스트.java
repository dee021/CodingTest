import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken()), l = n-v+1, q;
		int[] node = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < n; i++) node[i] = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < m; i++) {
			q = Integer.parseInt(br.readLine());
			if (q < n) sb.append(node[q]).append("\n");
			else sb.append(node[(q-v+1)%l + (v-1)]).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}