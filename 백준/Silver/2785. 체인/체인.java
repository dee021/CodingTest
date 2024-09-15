import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	static ArrayList<Integer> lengths;
	static int n, chain, one;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		lengths = new ArrayList();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			lengths.add(Integer.parseInt(st.nextToken()));
		}
		lengths.sort(null);
		System.out.println(solution());
	}
	
	static public int solution() {
		int answer = 0;
		while(lengths.size() > 1) {
			chain = lengths.get(0);
			lengths.remove(0);
			while (chain > 0 && !lengths.isEmpty()) {
				answer++;
				chain--;
				one = lengths.get(lengths.size()-1) +1;
				lengths.remove(lengths.size()-1);
				if (lengths.isEmpty()) {
					lengths.add(one + chain);
					chain = 0;
				} else {
					lengths.add(one + lengths.get(lengths.size()-1));
					lengths.remove(lengths.size()-2);
				}
			}
		}
		return answer;
	}
}