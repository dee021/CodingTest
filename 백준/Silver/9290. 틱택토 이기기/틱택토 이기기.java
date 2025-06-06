import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
        	sb.append(String.format("Case %d:\n", tc));
        	char[][] board = new char[3][];
        	for (int i = 0; i < 3; i++) {
        		board[i] = br.readLine().toCharArray();
        	}
        	char target = br.readLine().charAt(0);
        	board = sol(board, target);
        	for (int i = 0; i < 3; i++) {
        		for (int j = 0; j < 3; j++) sb.append(board[i][j]);
        		sb.append("\n");
        	}
        }
        
        System.out.println(sb);
        br.close();
    }
    
    
    public static char[][] sol(char[][] board, char target) {
    	ArrayList<int[]> al = new ArrayList<>();
    	for (int r = 0; r < 3; r++) {
    		for (int c = 0; c < 3; c++) {
    			if (board[r][c] == target) al.add(new int[] {r, c});
    		}
    	}
    	
    	for (int i = 0; i < al.size()-1; i++) {
    		for (int j = i+1; j < al.size(); j++) {
    			int[] t1 = al.get(i), t2 = al.get(j);
    			if (t1[0] == t2[0] && board[t1[0]][3 - t1[1] - t2[1]] == '-') {
    				board[t1[0]][3 - t1[1] - t2[1]] = target;
    				return board;
    			}
    			if (t1[1] == t2[1] && board[3 - t1[0] - t2[0]][t1[1]] == '-') {
    				board[3 - t1[0] - t2[0]][t1[1]] = target;
    				return board;
    			}
    			if (board[3 - t1[0] - t2[0]][3 - t1[1] - t2[1]] == '-') {
    				board[3 - t1[0] - t2[0]][3 - t1[1] - t2[1]] = target;
    				return board;
    			}
    		}
    	}
    	
    	return board;
    }
}