import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static int t;
	private static int[] arr;
	private static int[] ans;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		t = Integer.parseInt(br.readLine());
		arr = new int [t]; ans = new int[t];
		for (int i = 0; i < t; i++) arr[i] = Integer.parseInt(br.readLine());
		
		boolean res;
		bruteForce: {
			for (int a = 0; a < 10001; a++) {
				for (int b = 0; b < 10001; b++) {
					if (check(a, b)) break bruteForce;
				}
			}
		}
		for (int i = 0; i < t; i++) sb.append(ans[i]).append("\n");
		System.out.println(sb);
		br.close();;
	}
	
	private static boolean check(int a, int b) {
		int next;
		for (int i = 0; i < t; i++) {
			ans[i] = (arr[i] * a + b) % 10001;
			next = (ans[i] * a + b) % 10001;
			if (i < t-1 && next != arr[i+1]) return false;
		}
		return true;
	}
}