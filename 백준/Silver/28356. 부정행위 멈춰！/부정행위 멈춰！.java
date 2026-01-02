import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), k = 1;
        int[][] arr = new int[n][m], dr = {{0,1}, {0,-1}, {1, 0}, {1, -1}, {1, 1}, {-1, 0}, {-1, 1}, {-1, -1}};
        
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < m; j++) {
        		for (int p = 1; p <= k; p++) {
        			boolean flag = true;
        			for (int d = 0; d < 8; d++) {
        				int r = i + dr[d][0], c = j + dr[d][1];
        				if (0 <= r && r < n && 0 <= c && c < m) {
        					if (arr[r][c] == p) {
        						flag = false;break;
        					}
        				}
        			}
        			if (flag) {
        				arr[i][j] = p;break;
        			}
        		}
        		if (arr[i][j] == 0) arr[i][j] = ++k;
        		
        		sb.append(arr[i][j]).append(" ");
        	}
        	sb.append("\n");
        }
        
        System.out.println(k);
        System.out.print(sb);
        br.close();
    }
}