import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int[] table = new int[m+1];
		Arrays.fill(table, 1001);
		ArrayList<String> print = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String oper = st.nextToken();
			if (oper.equals("order")) {
				int no = Integer.parseInt(st.nextToken()), time = Integer.parseInt(st.nextToken());
				table[no] = time;
				print.add(String.valueOf(no));
			} else if (oper.equals("complete")) {
				int no = Integer.parseInt(st.nextToken());
				table[no] = 1001;
				print.remove(String.valueOf(no));
			} else { 
				print = sort(table, m, print.size());
			}
			
			if (print.isEmpty())sb.append("sleep");
			else for (int j = 0; j < print.size(); j++) sb.append(print.get(j)).append(" ");
			sb.append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
	
    
	static ArrayList<String> sort(int[] table, int m, int size) {
		int[][] tmp = new int[size][2];
		int idx = 0;
		for (int i = 1; i < m+1; i++) {
			if (table[i] < 1001) {
				tmp[idx][0] = i;
				tmp[idx][1] = table[i];
				idx++;
			}
		}
		
		Arrays.sort(tmp, (int[] e1, int[] e2) -> {
			if (e1[1] == e2[1]) return e1[0] - e2[0];
			return e1[1] - e2[1];
		});
		
		ArrayList<String> res = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			res.add(String.valueOf(tmp[i][0]));
		}

		return res;
	}
}