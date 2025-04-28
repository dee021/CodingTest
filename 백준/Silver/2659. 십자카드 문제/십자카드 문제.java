import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int cnt = 0;
	static boolean[] visited = new boolean[10000];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] arr = br.readLine().split(" ");
		int target = clockNum(arr);
		bruteForce(0, target, new String[] {"1","1","1","1"});
		System.out.println(cnt);
		
		br.close();
	}
	
	static void bruteForce(int idx, int target, String[] res) {
		if (idx == 4) {
			int num = clockNum(res);
			if (!visited[num]) {
				visited[num] = true;
				if (target >= num )cnt++;
			}
			return;
		}
		
		for (int i = 1; i < 10; i++) {
			res[idx] = String.valueOf(i);
			bruteForce(idx+1, target, res.clone());
		}
		return;
	}
	
	static int clockNum(String[] arr) {
		StringBuilder sb = new StringBuilder();
		int min = 9999;
        
		for (int i = 0; i < 4; i++) {
			sb.setLength(0);
			for (int j = 0; j < 4; j++) sb.append(arr[(i+j)%4]);
			min = Math.min(min, Integer.parseInt(sb.toString()));
		}
		return min;
	}
}