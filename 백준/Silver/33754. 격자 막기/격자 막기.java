import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		
		int n = Integer.parseInt(br.readLine()), answer = 2;
		int[][] arr = new int[n][2];
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < n; j++) arr[j][i] = Integer.parseInt(st.nextToken()); 
		}
		
		for (int i = 0; i < n; i++) {
			if (arr[i][0] == 0) {
				if (arr[i-1][1] + arr[i][1] < 2 || (i < n-1 && arr[i+1][1] == 0)) answer = 0;
				else answer = 1;
			}
			if (arr[i][1] == 0) {
				if ((i > 0 && arr[i-1][0] == 0) || arr[i][0] + arr[i+1][0] < 2) answer = 0;
				else answer = Math.min(answer, 1);
			}
			if (answer == 0) break;
		}

		System.out.println(answer);
		br.close();
	}
}