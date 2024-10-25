import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] arr;
	static int end;
	public static boolean selectSort() {
		int value, index;
		boolean flag = false;
		while (end-- > 0) {
			value = arr[end];
			index = end;
			for (int i = end; i > -1; i--) {
				if (arr[i] > value) {
					value = arr[i];
					index = i;
					flag = true;
				}
			}
			if (flag == true) {
				arr[index] = arr[end];
				arr[end] = value;
				return flag;
			}
		}
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		arr = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		boolean res = true;
		end = n;
		while (k-- > 0 && res == true) {
			res = selectSort();
		}
		if (res == false) System.out.println(-1);
		else {
			for (int i=0; i < arr.length; i++) {
				System.out.print(arr[i]);
				if (i < arr.length -1) System.out.print(" ");
				else System.out.println();
			}
		}
		br.close();
	}	
}