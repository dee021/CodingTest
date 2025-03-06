import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
        
		int m = Integer.parseInt(br.readLine()), oper, x;
		long w;
		HashMap<Long, Integer> cabinet = new HashMap();
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			oper = Integer.parseInt(st.nextToken());
			switch (oper) {
			case 1:
				x = Integer.parseInt(st.nextToken());
				w = Integer.parseInt(st.nextToken());
				cabinet.put(w, x);
				break;
			case 2:
				w = Integer.parseInt(st.nextToken());
				sb.append(cabinet.get(w)).append("\n");
				break;
			}
		}

		System.out.println(sb);
		br.close();
	}
}