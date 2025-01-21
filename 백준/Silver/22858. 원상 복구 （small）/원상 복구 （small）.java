import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), idx;
		int[] s = new int[n], d = new int[n], p = new int[n];
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) s[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++)d[i] = Integer.parseInt(st.nextToken()) -1;

		for (int i = 0; i < n; i++) {
			idx = i;
			for (int c = 0; c < k && idx != d[idx]; c++) {
				idx = d[idx];
			}
			p[idx] = s[i];
		}
		
		for (int i = 0; i < n; i++) System.out.print((i == 0)? p[i]:" "+p[i]);
		br.close();
	}	
}