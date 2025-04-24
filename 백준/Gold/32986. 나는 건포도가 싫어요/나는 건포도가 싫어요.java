import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int[] arr = new int[3];
		for (int i = 0; i < 3; i++) arr[i] = Integer.parseInt(st.nextToken());
		System.out.println(sol(arr));
		br.close();
	}
	
	static int sol(int[] size) {
		Arrays.sort(size);
		if (size[0] <= 2) return 0;
		if (size[2] == 3) return 0;
		return (size[0] -1) /2;
	}
}