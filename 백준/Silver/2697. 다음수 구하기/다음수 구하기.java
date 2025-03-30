import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine()), idx;
		String input;
		while (t-- > 0) {
			input = br.readLine();
			arr = new int[input.length()];
			idx = 0;
			for (char c: input.toCharArray()) arr[idx++] = c-'0';
			if (solution(0, arr.length-1, 0)) {
				for (int i = 0; i < idx; i++) sb.append(arr[i]);
				sb.append("\n");
			} else sb.append("BIGGEST\n");
		}
		
		System.out.println(sb);
		br.close();
	}
	
	static boolean solution(int s, int e, int depth) {
		int tmp;
		while (e > s) {
			for (int i = e-1; i >= s; i--) {
				if (arr[e] > arr[i]) {
					if (e-i == 1) {
						tmp = arr[e];
						arr[e] = arr[i];
						arr[i] = tmp;
						Arrays.sort(arr, i+1, arr.length);
						return true;
					} else if (solution(i+1, e-1, depth+1)) return true;
					else { 
						tmp = arr[e];
						arr[e] = arr[i];
						arr[i] = tmp;
						Arrays.sort(arr, i+1, arr.length);
						return true;
					}
				}
			}
			e--;
		}
		return false;
	}
}