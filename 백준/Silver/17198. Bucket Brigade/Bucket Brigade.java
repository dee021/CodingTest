import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayDeque;

public class Main {
	static char[][] arr = new char[10][];
	static int[][] dr = {{0,1}, {0,-1}, {1,0}, {-1,0}};
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int r = -1, c = -1; 
        
        for(int i = 0; i < 10; i++) {
        	arr[i] = br.readLine().toCharArray();
        	for (int j = 0; r== -1 && j < 10; j++) {
        		if (arr[i][j] == 'B') {
        			r = i; c = j;
        		}
        	}
        }
        
        System.out.println(sol(r, c));
        br.close();
    }
	
	static int sol(int r, int c) {
		
		ArrayDeque<int[]> ad = new ArrayDeque<>();
		ad.add(new int[] {r, c, 0});
		arr[r][c] = 'R';
		
		while (!ad.isEmpty()) {
			int[] cur = ad.poll();
			for (int i = 0; i < 4; i++) {
				int y = cur[0] + dr[i][0], x = cur[1] + dr[i][1];
				
				if (0 <= y && y < 10 && 0 <= x && x < 10 && arr[y][x] != 'R') {
					if (arr[y][x] == 'L') return cur[2];
					ad.add(new int[] {y, x, cur[2]+1});
					arr[y][x] = 'R';
				}
			}
		}
		return -1;
	}
}