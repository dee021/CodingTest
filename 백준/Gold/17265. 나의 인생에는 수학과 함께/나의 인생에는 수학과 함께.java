import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[][] input = new String[n][];
		int[][] max = new int[n][n], min = new int[n][n];
		for (int i = 0; i < n; i++) {
			input[i] = br.readLine().strip().split(" ");
			Arrays.fill(max[i], Integer.MIN_VALUE);
			Arrays.fill(min[i], Integer.MAX_VALUE);
		}
		max[0][0] = min[0][0] = Integer.parseInt(input[0][0]);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j > 1) {
					max[i][j] = Math.max(calc(max[i][j-2], input[i][j-1], input[i][j]), max[i][j]);
					min[i][j] = Math.min(calc(min[i][j-2], input[i][j-1], input[i][j]), min[i][j]);
				}
				if (i > 1) {
					max[i][j] = Math.max(calc(max[i-2][j], input[i-1][j], input[i][j]), max[i][j]);
					min[i][j] = Math.min(calc(min[i-2][j], input[i-1][j], input[i][j]), min[i][j]);
				}
				if (i > 0 && j > 0) {
					max[i][j] = Math.max(calc(max[i-1][j-1], input[i][j-1], input[i][j]), max[i][j]);
					min[i][j] = Math.min(calc(min[i-1][j-1], input[i][j-1], input[i][j]), min[i][j]);
					max[i][j] = Math.max(calc(max[i-1][j-1], input[i-1][j], input[i][j]), max[i][j]);
					min[i][j] = Math.min(calc(min[i-1][j-1], input[i-1][j], input[i][j]), min[i][j]);
				}
			}
		}

		System.out.println(max[n-1][n-1] + " " + min[n-1][n-1]);
		br.close();
	}
	
	private static int calc(int x, String op, String y) {
		int res = 1000;
		switch (op) {
		case "+":
			res =  x + Integer.parseInt(y);
			break;
		case "-":
			res =  x - Integer.parseInt(y);
			break;
		case "*":
			res = x * Integer.parseInt(y);
		}
		return res;
	}
}