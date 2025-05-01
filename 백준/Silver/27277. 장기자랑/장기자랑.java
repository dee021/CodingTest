import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()), answer = 0;
		ArrayList<Integer> list = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) list.add(Integer.parseInt(st.nextToken()));
		list.sort(null);
		int f = list.remove(n-1), idx;
		
		while (list.size() > 1) {
			if (f - list.get(0) <= 0 && f - list.get(1) <= 0) idx = list.size()-1;
			else if (f - list.get(0) > f - list.get(1)) idx = 0;
			else idx = 1;
			
			answer += Math.max(f - list.get(idx), 0);
			f = list.remove(idx);
		}
		
		if (!list.isEmpty()) {
			answer += Math.max(f - list.get(0), 0) + list.get(0);
		} else answer += f;
		
		System.out.println(answer);
		
		br.close();
	}
}