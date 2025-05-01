import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static boolean[] visited = new boolean[6];
	static String[] words = new String[6];
	static String[] puzzle = new String[3];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 6; i++) words[i] = br.readLine();
		boolean res = bruteForce(0);
		if (res) for (int i = 0; i < 3; i++) System.out.println(puzzle[i]);
		else System.out.println(0);
		
		br.close();
	}
	
	static boolean bruteForce(int line) {
		if (line > 2) {
			int[] idxs = {-1, -1, -1};
			for (int c = 0; c < 3; c++) {
				boolean flag = false;
				String tmp = "";
				for (int r = 0; r < 3; r++) tmp += puzzle[r].charAt(c);
				
				for (int j = 0; j < 6; j++) {
					if (!visited[j] && words[j].equals(tmp)) {
						idxs[c] = j;
						visited[j] = true;
						flag = true;
						break;
					}
				}
				
				if (!flag) {
					for (int i = 0; i < 3 && idxs[i] > -1; i++)visited[idxs[i]] = false;
					return false;
				}
			}
			return true;
		}

		boolean res = false;
		for (int i = 0; i < 6; i++) {
			if (!visited[i]) {
				visited[i] = true;
				puzzle[line] = words[i];
				res = bruteForce(line+1);
				if (res) return res;
				visited[i] = false;
			}
		}
		return res;
	}
}