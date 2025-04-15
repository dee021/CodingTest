import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n+1][3];
		int[] line = new int[n];
		
		for (int i = 1; i < n+1; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 2; j++) arr[i][j] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 1; i < n+1; i++) {
			int o = 0;
			for (int j = i+1; j < n+1; j++) {
				if (arr[i][0] + arr[j][0]*arr[i][1] > arr[j][0] + arr[i][0]*arr[j][1]) arr[j][2]++;
				else o++;
			}
			line[o+arr[i][2]] = i;
		}
		
		for (int i = 0; i < n; i++) sb.append(line[i]).append("\n");
		
		System.out.println(sb);
		br.close();
	}
}