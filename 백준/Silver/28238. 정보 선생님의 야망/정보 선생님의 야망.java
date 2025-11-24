import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	static int n, max = 0;
	static int[][] arr;
	static int[] ans = new int[5];
	
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        n = Integer.parseInt(br.readLine());
        arr = new int[n][5];
        
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int j = 0; j < 5; j++) arr[i][j] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 4; i > 0; i--) {
        	for (int j = i -1; j >= 0; j--) bruteForce(new int[n], i, j);
        }
        
        bruteForce(new int[n], 4, 0);
        
        for (int i = 0; i < 5; i++) sb.append(ans[i]).append(" ");
        System.out.println(max);
        System.out.println(sb);
        br.close();
    }
    
	static void bruteForce(int[] visited, int d1, int d2) {
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (visited[i] == 0) {
				if (arr[i][d1] == 1 && arr[i][d2] == 1) {
					visited[i] = 1;
					cnt++;
				}
			}
		}
		
		if (cnt >= max) {
			max = cnt;
			ans = new int[5];
			ans[d1] = ans[d2] = 1;
		}
		return ;
	}
}