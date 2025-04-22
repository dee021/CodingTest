import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

class Result{
	private int team, res;
	
	Result(int team, int res) {
		this.team = team;
		this.res = res;
	}

	public int getTeam() {
		return team;
	}

	public int getRes() {
		return res;
	}
}

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		int[] shared = new int[n], team = new int[n];
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) shared[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) team[i] = Integer.parseInt(st.nextToken());
		
		Result[] result = new Result[n*n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result[i*n+j] = new Result(team[j], shared[i]*team[j]);
			}
		}
		
		Arrays.sort(result, (r1, r2) -> r2.getRes() - r1.getRes());
		
		Set<Integer> del = new HashSet<>();
		for (Result res: result) {
			if (del.size() < k) {
				del.add(res.getTeam());
			} else if (!del.contains(res.getTeam())) {
				System.out.println(res.getRes());
				break;
			}
		}
        
		br.close();
	}
}