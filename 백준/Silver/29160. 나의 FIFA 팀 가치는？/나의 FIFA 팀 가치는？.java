import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Arrays;

class Position {
	int no;
	PriorityQueue<Integer> player = new PriorityQueue<>(Collections.reverseOrder());
	
	public Position(int no) {
		this.no = no;
	}
	
	void add(int w) {
		player.add(w);
	}
	
	int select() {
		if (player.isEmpty()) return -1;
		return player.poll();
	}
	
	int change(int w) {
		if (player.isEmpty() || player.peek() <= w) return w;
		player.add(w);
		return player.poll();
	}
}

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int[] team = new int[12];
		Arrays.fill(team, -1);
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		Position[] position = new Position[12];
		for (int i = 1; i < 12; i++) position[i] = new Position(i);
		
		int p, w;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			p = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());
			position[p].add(w);
		}
		
		while (k-- > 0) {
			for (int i = 1; i < 12; i++) {
				if (team[i] != -1) team[i] = position[i].change(team[i]);
				else team[i] = position[i].select();
			
				if (team[i] > 0) team[i]--;
                
                if (team[i] != -1) team[i] = position[i].change(team[i]);
				else team[i] = position[i].select();
			}
		}
		
		int sum = 0;
		for (int i = 1; i < 12; i++) if (team[i] > 0)sum += team[i];
		System.out.println(sum);
		br.close();
	}
}