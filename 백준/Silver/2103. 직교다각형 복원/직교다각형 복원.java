import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[][] spot = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 2; j++) spot[i][j] = Integer.parseInt(st.nextToken());
		}
		
		long length = 0;
		Arrays.sort(spot, (elem1, elem2) -> {
			if (elem1[0] != elem2[0]) return elem1[0] - elem2[0];
			else return elem1[1] - elem2[1];
		});
		for (int i = 0; i < n; i+=2) length += spot[i+1][1] - spot[i][1];
        
		Arrays.sort(spot, (elem1, elem2) -> {
			if (elem1[1] != elem2[1]) return elem1[1] - elem2[1];
			else return elem1[0] - elem2[0];
		});
		for (int i = 0; i < n; i+=2) length += spot[i+1][0] - spot[i][0];


		System.out.println(length);
		br.close();
	}
}