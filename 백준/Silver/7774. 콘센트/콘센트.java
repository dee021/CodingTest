import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		Integer[] aToB = new Integer[n], bToA = new Integer[m];
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) aToB[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < m; i++) bToA[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(aToB, (e1, e2) -> e2 - e1);
		Arrays.sort(bToA, (e1, e2) -> e2 - e1);
		
		int aTB = 0, bTA = 0;
		long a = 1, b = 0, max = 1;
		boolean makeA = false;
		while ((!makeA && aTB < n) || (makeA && bTA < m) ) {
			if (!makeA) { // a-> b
				a--; b += aToB[aTB++];
				makeA = true;
			} else { // b -> a
				while (b > 0 && bTA < m) {
					b--; a += bToA[bTA++];
				}
				makeA = false;
                max = Math.max(max, a);
			}
		}
		
		System.out.println(max);
		br.close();
	}
}