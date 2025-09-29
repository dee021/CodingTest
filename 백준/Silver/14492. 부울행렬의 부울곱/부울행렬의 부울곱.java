import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()), ans = 0;
        boolean[][] a = new boolean[n][n], b = new boolean[n][n];
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int j = 0; j < n; j++) a[i][j] = st.nextToken().equals("1")? true:false;
        }
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int j = 0; j < n; j++) b[i][j] = st.nextToken().equals("1")? true:false;
        }
        
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < n; j++) {
        		boolean c = a[i][0] & b[0][j];
        		for (int k = 1; k < n; k++) {
        			c |= a[i][k] & b[k][j];
        		}
        		if (c) ans++;
        	}
        }
        System.out.println(ans);
        br.close();
    }
}