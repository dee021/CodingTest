import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] potato = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) potato[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(potato);
		int s = 0, b = 0;
		for (int i = 0; i < n; i++) {
			if (i < n/2) s += potato[i];
			else b += potato[i];
		}
		System.out.println(s + " " + b);
		br.close();

	}
}