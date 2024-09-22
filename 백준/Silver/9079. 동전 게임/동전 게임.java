import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int bfs(int[] state) {
		if (state[0] == 0 || state[0] == 511) return 0;
		int[] visited = new int[1<<9];
		visited[state[0]] = 1;
		Queue<int[]> q = new LinkedList<int[]>();
		q.offer(state);
		int[] front, post;
		int row, col;
		while (!q.isEmpty()) {
			front = q.poll();
			if (visited[front[0] ^ 0b100010001] == 0) {
				visited[front[0] ^ 0b100010001] = 1;
				post = new int[2];
				post[0] = front[0] ^ 0b100010001;
				post[1] = front[1]+1;
				q.offer(post);
			}
			if (visited[front[0] ^ 0b001010100] == 0) {
				visited[front[0] ^ 0b001010100] = 1;
				post = new int[2];
				post[0] = front[0] ^ 0b001010100;
				post[1] = front[1]+1;
				q.offer(post);
			}
			row = 0b111;
			col = 0b1001001;
			for (int i = 0; i <3; i++) {
				if (visited[front[0] ^ row] == 0) {
					visited[front[0] ^ row] = 1;
					post = new int[2];
					post[0] = front[0] ^ row;
					post[1] = front[1]+1;
					q.offer(post);
				}
				if (visited[front[0] ^ col] == 0) {
					visited[front[0] ^ col] = 1;
					post = new int[2];
					post[0] = front[0] ^ col;
					post[1] = front[1]+1;
					q.offer(post);
				}
				row<<=3;
				col<<=1;
			}
			if (visited[0] == 1 || visited[511] == 1) return front[1]+1;
		}
		return -1;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int tc = Integer.parseInt(br.readLine());
		for (int i = 0; i < tc; i++) {
			int coins = 0;
			for (int j = 0; j < 3; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				for (int z = 0; z < 3; z++) {
					coins <<= 1;
					if (st.nextToken().equals("H")) coins++;
				}
			}
			int[] state = {coins, 0};
			int ans = bfs(state);
			System.out.println(ans);
		}
	}
}