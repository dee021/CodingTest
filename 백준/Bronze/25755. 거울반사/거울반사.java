import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int n;
	static int[] mirror;
	static int[][] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		mirror = new int[10];
		mirror[1] = 1; mirror[8]=8; mirror[2] = 5; mirror[5] = 2;
		
		String d = st.nextToken();
		n = Integer.parseInt(st.nextToken());
		
		arr = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < n; j++) arr[i][j] = Integer.parseInt(st.nextToken());
		}
		
		if ("UD".contains(d)) upOrDown();
		else leftOrRight();

		br.close();
	}
	
	static void upOrDown() {
		int num;
		for (int i = n-1; i >= 0; i--) {
			for (int j = 0; j < n; j++) {
				num = mirror[arr[i][j]];
				switch (num) {
				case 0:
					System.out.print("? ");
					break;
				default:
					System.out.print(num+" ");
				}	
			}
			System.out.println();
		}
	}
	
	static void leftOrRight() {
		int num;
		for (int i = 0; i < n; i++) {
			for (int j = n-1; j >= 0; j--) {
				num = mirror[arr[i][j]];
				switch (num) {
				case 0:
					System.out.print("? ");
					break;
				default:
					System.out.print(num+" ");
				}	
			}
			System.out.println();
		}
	}
}