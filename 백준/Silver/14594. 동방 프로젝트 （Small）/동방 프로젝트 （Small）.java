import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine()), m = Integer.parseInt(br.readLine()), x, y;
		int[] room = new int[n];
		Arrays.fill(room, 1);
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			x = Integer.parseInt(st.nextToken())-1; y = Integer.parseInt(st.nextToken())-1;
			for (int j = x+1; j <= y; j++) room[j] = 0;
		}

		System.out.println(Arrays.stream(room).sum());

		br.close();
	}	
}