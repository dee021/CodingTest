import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        
        for (int i = 0; i < n; i++) {
        	String line = br.readLine();
        	for (int j = 0; j < n; j++) {
        		if (line.charAt(j) == '.') continue;
        		map[i][j] = -1;
        		for (int di = -1; di < 2; di++) {
        			for (int dj = -1; dj < 2; dj++) {
        				if (di == 0 && dj == 0) continue;
        				if (i + di < 0 || i + di >= n || j + dj < 0 || j + dj >= n) continue;
        				if (map[i + di][j + dj] >= 0) map[i + di][j + dj] += line.charAt(j) - '0';
        			}
        		}
        	}
        }
        
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < n; j++) {
        		if (map[i][j] == -1) sb.append('*');
        		else if (map[i][j] > 9) sb.append('M');
        		else sb.append(map[i][j]);
        	}
        	sb.append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}