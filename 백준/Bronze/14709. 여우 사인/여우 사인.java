import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        boolean[][] fg = new boolean[6][6];
        int n = Integer.parseInt(br.readLine());
        
        while (n-- > 0) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        	fg[a][b] = true;
        	fg[b][a] = true;
        }
        
        boolean flag = true;
        
        for (int i = 1; i < 5; i++) {
        	for (int j = i+1; j < 6; j++) {
        		if (i != 2) {
        			if (j == 2 || j == 5) {
        				if (fg[i][j]) flag = false;
        			} else {
        				if (!fg[i][j]) flag = false;
        			}
        		} else { // i == 2
        			if (fg[i][j]) {
        				flag = false;
        			}
        		}
        	}
        }
        
        System.out.print(flag? "Wa-pa-pa-pa-pa-pa-pow!": "Woof-meow-tweet-squeek");
        br.close();
    }
}