import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] score = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++)score[i] = Integer.parseInt(st.nextToken());

		int[][][] dp = new int[n][2][3];
		dp[0] = new int[][] {{-1, score[0], score[0]},{0, score[0], score[0]}};
		int[] group0, group1;
		
		for (int i = 1; i < n; i++) {
			group0 = checkArray(score[i], dp[i-1][0]);
			group1 = checkArray(score[i], dp[i-1][1]);
			if (group0[0] > group1[0]) dp[i][0] = group0;
			else if(group0[0] < group1[0]) dp[i][0] = group1;
			else if(group0[2] - group0[1] < group1[2] - group1[1]) dp[i][0] = group0;
			else dp[i][0] = group1;
			dp[i][1] = new int[] {Math.max(dp[i-1][0][0], dp[i-1][1][0]), score[i], score[i]};
		}

		System.out.println(Math.max(dp[n-1][0][0], dp[n-1][1][0]));

		br.close();
	}
	
	static int[] checkArray(int s, int[] inputArr) {
		int [] arr = new int[3];
		for (int i = 0; i < 3; i++) arr[i] = inputArr[i];
		if (s < arr[1]) {
			arr[0] += arr[1] - s;
			arr[1] = s;
		} else if (s > arr[2]) {
			arr[0] += s - arr[2];
			arr[2] = s;
		}
		return arr;
	}

}