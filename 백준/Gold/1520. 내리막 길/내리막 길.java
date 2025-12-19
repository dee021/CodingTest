import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	static int n, m;
	static int[][] arr, dp, dr = {{0,1}, {0,-1}, {1,0}, {-1, 0}};
	static boolean[][] visited;
	
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        arr = new int[n][m];
        dp = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i ++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int j = 0; j < m; j++) arr[i][j] = Integer.parseInt(st.nextToken());
        }
        
        System.out.println(sol(0, 0));
        br.close();
    }
    
    static int sol(int r, int c) {
    	if (r == n-1 && c == m-1) return 1;
    	
    	visited[r][c] = true;
    	
    	for (int i = 0; i < 4; i++) {
    		int y = r + dr[i][0], x = c + dr[i][1];
    		
    		if (0 <= y && y < n && 0 <= x && x < m && arr[r][c] > arr[y][x]) {
    			if (visited[y][x]) {
    				dp[r][c] += dp[y][x];
    			} else {
    				dp[r][c] += sol(y, x);
    			}
    		}
    	}
    	
    	return dp[r][c];
    }
}