import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        long answer = 0;
		boolean[][] adj = new boolean[n+1][n+1];
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
			adj[l][r] = true;
		}
		
		for (int l1 = 1; l1 < n; l1++) {
			for (int l2 = l1+1; l2 < n+1; l2++) {
				int cnt = 0;
				for (int r = 1; r < n+1; r++) if(adj[l1][r] & adj[l2][r]) cnt++;
				if (cnt >= 2) answer += cnt*(cnt-1)/2;
			}
		}
		
		System.out.println(answer);
		br.close();
	}
}