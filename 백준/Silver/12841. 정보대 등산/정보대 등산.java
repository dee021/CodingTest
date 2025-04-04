import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()), spot = 0;
		long min = Long.MAX_VALUE, dis;
		long[][] arr = new long[3][n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < n; i++) arr[0][i] = Long.parseLong(st.nextToken());
		for (int i = 1; i < 3; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 1; j < n; j++) arr[i][j] = arr[i][j-1] + Long.parseLong(st.nextToken());
		}
		
		for (int i = 0; i < n; i++) {
			dis = arr[0][i] + arr[1][i] + arr[2][n-1] - arr[2][i];
			if (min > dis) {
				min = dis;
				spot = i+1;
			}
		}
		
		System.out.println(spot + " " + min);
		br.close();
	}
}