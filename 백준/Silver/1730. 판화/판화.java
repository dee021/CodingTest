import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine()), y = 0, x = 0;
        boolean[][] horizon = new boolean[n][n], vertical = new boolean[n][n];
        
        for (char c: br.readLine().toCharArray()) {
        	switch (c) {
        	case 'D' : 
        		if (0 <= y && y < n-1) {
        			vertical[y++][x] = true;
        			vertical[y][x] = true;
        		}
        		break;
        	case 'U':
        		if (0 < y && y < n) {
        			vertical[y--][x] = true;
        			vertical[y][x] = true;
        		}
        		break;
        	case 'R':
        		if (0 <= x && x < n-1) {
        			horizon[y][x++] = true;
        			horizon[y][x] = true;
        		}
        		break;
        	case 'L':
        		if (0 < x && x < n) {
        			horizon[y][x--] = true;
        			horizon[y][x] = true;
        		}
        	}
        }
        
        
        for (int i = 0; i < n ; i++) {
        	for (int j = 0; j < n ; j++) {
        		if (horizon[i][j] && vertical[i][j]) sb.append('+');
        		else if (horizon[i][j]) sb.append('-');
        		else if (vertical[i][j]) sb.append('|');
        		else sb.append('.');
        	}
        	sb.append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}