import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int tc = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int n = Integer.parseInt(br.readLine());
			int res = sol(n);
			if (res > 0) sb.append(String.format("Case #%d: %d\n", t, res));
			else sb.append(String.format("Case #%d: INSOMNIA\n", t));
		}
		
		System.out.println(sb);
		br.close();
	}
	
	static int sol(int n) {
		if (n == 0) return 0;
		Set<Integer> number = new HashSet<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
		int k = 0;
		while (!number.isEmpty()) {
			k++;
			int num = k*n;
			while (num > 0) {
				if (number.contains(num%10)) number.remove(num%10);
				num /= 10;
			}
		}
		return n*k;
	}
}