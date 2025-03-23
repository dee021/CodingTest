import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] part1 = br.readLine().strip().toCharArray(), part2 = br.readLine().strip().toCharArray();
		int ans = part1.length + part2.length;
		int idx1 = 0, idx2 = part2.length-1;
		boolean flag;
		
		while (idx1 < part1.length) {
			flag = true;
			for (int i = idx1, j = idx2; i < part1.length && j < part2.length; i++, j++) {
				if (part1[i] == '2' && part2[j] == '2') {
					flag = false;
					break;
				}
			}
			if (flag) ans = Math.min(ans, Math.max(idx1 + part2.length, part1.length + idx2));
			if (idx2 > 0) idx2--;
			else idx1++;
		}
		
		System.out.println(ans);
	}
}