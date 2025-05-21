import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] arr = new char[7][];
        for (int i = 0; i < 7; i++) arr[i] = br.readLine().toCharArray();
        
        System.out.println(sol(arr));
        br.close();
    }
    
    static int sol(char[][] arr) {
    	int cnt = 0;
    	int[][] d = {{0,1}, {0,-1}, {1,0}, {-1,0}};
    	
    	
    	for (int i = 0; i < 7; i++) { //r
    		for (int j = 0; j < 7; j++) { //c
    			if (arr[i][j] != '.') continue;
    			for (int k = 0; k < 4; k++) {
    				int dy = d[k][0], dx = d[k][1];
    				if (dy != 0 && i + 2*dy >=0 && i + 2*dy < 7) {
    					if (arr[i + dy][j] == 'o' && arr[i + 2*dy][j] == 'o') cnt++;
    				} else if (dx != 0 && j + 2*dx >=0 && j + 2*dx < 7) {
    					if (arr[i][j + dx] == 'o' && arr[i][j + 2*dx] == 'o') cnt++;
    				}
    			}
    		}
    	}
    	
    	return cnt;
    }
}