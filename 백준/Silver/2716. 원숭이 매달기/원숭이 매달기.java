import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tc = Integer.parseInt(br.readLine());	
		while (tc-- > 0) {
			String input = br.readLine();
			System.out.println(recursionFunc(input.toCharArray()));
		}
		br.close();
	}
	
	static int recursionFunc(char[] tree) {
		if (tree.length == 0) return 1;
		
		int max = 1, cnt = 0, start = 0;
		
		for (int i = 0; i < tree.length; i++) {
			if (tree[i] == '[') {
				cnt++;
				if (cnt == 1) start = i;
			}
			else {
				cnt--;
				if (cnt == 0) max = Math.max(max, recursionFunc(Arrays.copyOfRange(tree, start+1, i)));
			}
			
		}
		return max*2;
	}
}