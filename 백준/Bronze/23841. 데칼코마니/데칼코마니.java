import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        
        char[][] arr = new char[n][];
        for (int i = 0; i < n; i++) {
        	arr[i] = br.readLine().toCharArray();
        }
        
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < m; j++) {
        		if (arr[i][j] != '.') arr[i][m-1-j] = arr[i][j];
        	}
        	for (int j = 0; j < m; j++) sb.append(arr[i][j]);
        	sb.append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}