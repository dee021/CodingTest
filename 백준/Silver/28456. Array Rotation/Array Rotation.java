import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static int n;
	private static int[][] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();

		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < n; j++) arr[i][j] = Integer.parseInt(st.nextToken());
		}
		
		int q = Integer.parseInt(br.readLine());
		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			if (st.nextToken().equals("1")) func1(Integer.parseInt(st.nextToken())-1);
			else func2();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) sb.append(arr[i][j]).append(" ");
			sb.append("\n");
		}
		System.out.print(sb);
		br.close();
	}
	
	
	private static void func1(int r) {
		int tmp = arr[r][n-1];
		for (int i = n-1; i > 0; i--) arr[r][i] = arr[r][i-1];
		arr[r][0] = tmp;
	}
	
	private static void func2() {
		int[][] tmp = new int[n][n];
		
		for (int i = 0; i < n; i++) { 
			for (int j = 0; j < n; j++) {
				tmp[j][n-i-1] = arr[i][j];
			}
		}
		arr = tmp;
	}
}