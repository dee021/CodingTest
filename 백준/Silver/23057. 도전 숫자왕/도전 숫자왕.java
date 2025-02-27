import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;

public class Main {
    private static Set<Integer> nums = new HashSet();
	private static int[] cards;
	private static int n;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		n = Integer.parseInt(br.readLine());
		cards = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
			sum += cards[i];
		}

		combination(-1, 0);
		System.out.println(sum - nums.size());
		br.close();
	}
	
	private static void combination(int idx, int res) {
		for (int i = idx+1; i < cards.length; i++) {
			nums.add(res + cards[i]);
			combination(i, res + cards[i]);
		}
	}
}