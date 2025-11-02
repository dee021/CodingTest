import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayDeque;

public class Main {
	static int[][] dr = {{0,1}, {0,-1}, {1,0}, {-1,0}};
	static int cnt = 0, n, m;
	static char[][] board;
	
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken()); m = Integer.parseInt(st.nextToken());
        board = new char[n][];
        
        for (int i = 0; i < n; i++) board[i] = br.readLine().toCharArray();
        
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < m; j++) if (board[i][j] == '#') bfs(i, j);
        }
        
        System.out.println(cnt);
        br.close();
    }
    
    static void bfs(int y, int x) {
    	ArrayDeque<int[]> ad = new ArrayDeque<>();
    	ad.add(new int[] {y, x});
    	board[y][x] = '.';
    	cnt++;
    	
    	while (!ad.isEmpty()) {
    		int[] cur = ad.poll();
    		
    		for (int i = 0; i < 4; i++) {
    			y = cur[0] + dr[i][0]; x = cur[1] + dr[i][1];
    			if (0 <= y && y < n && 0 <= x && x < m && board[y][x] == '#') {
    				board[y][x] = '.';
    				ad.add(new int[] {y, x});
    			}
    		}
    	}
    	
    }
}