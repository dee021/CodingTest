import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.PriorityQueue;
import java.util.Map;
import java.util.HashMap;

class Contest implements Comparable<Contest> {
	String team;
	int solved, penalty;
	
	public Contest(String team, int solved, int penalty) {
		this.team = team;
		this.solved = solved;
		this.penalty = penalty;
	}
	
	void compare(String team, int solved, int penalty) {
		if (this.compareTo(new Contest(team, solved, penalty)) > 0) change(team, solved, penalty);
	}
	
	private void change(String team, int solved, int penalty) {
		this.team = team;
		this.solved = solved;
		this.penalty = penalty;
	}

    /*
	@Override
	public String toString() {
		return "Contest [team=" + team + ", solved=" + solved + ", penalty=" + penalty + "]";
	}
    */

	public String getTeam() {
		return team;
	}

	@Override
	public int compareTo(Contest o) {
		if (this.solved == o.solved) return this.penalty - o.penalty;
		return o.solved - this.solved;
	}
}

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        Map<String, Contest> map = new HashMap<>();
        
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	String univ = st.nextToken();
        	
        	if (map.containsKey(univ)) {
        		map.get(univ).compare(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        	} else {
        		map.put(univ, new Contest(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        	}
        	
        	// System.out.println(map.get(univ).toString());
        }
        
        PriorityQueue<Contest> pq = new PriorityQueue<>();
        for (String univ: map.keySet()) {
        	pq.add(map.get(univ));
        }
        
        while (k-- > 0) sb.append(pq.poll().getTeam()).append("\n");
        
        System.out.print(sb);
        br.close();
    }
}