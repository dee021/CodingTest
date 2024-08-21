import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] card;
	static int person, num, p;
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		person = 0; num = 0;p = 0;
		card = new int[5];
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			p++;
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 5; j++) {
				card[j] = Integer.parseInt(st.nextToken());
				}
			findBigNum(0,0,0);
			}
		System.out.print(person);
	}
	
	static int findBigNum(int idx, int cnt, int res) {
		if (cnt == 3) {
			if (num <= res) {
				person = p;
				num = res;
			}
			return 0;
		}
		
		if (idx >= 5) return 0;
		
		findBigNum(idx +1, cnt, res);
		findBigNum(idx +1, cnt +1, (res + card[idx])%10);
		return 0;
	}
}