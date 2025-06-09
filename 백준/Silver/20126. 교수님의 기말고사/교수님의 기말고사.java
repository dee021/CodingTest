import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken()), ans = -1;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	arr[i][0] = Integer.parseInt(st.nextToken());
        	arr[i][1] = arr[i][0] + Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr, (e1, e2) -> e1[0] - e2[0]);
        
        
        for (int i = 1; i < n; i++) {
        	if (arr[i][0] - arr[i-1][1] >= m) {
        		ans = arr[i-1][1];break;
        	}
        }
        
        if (arr[0][0] >= m) ans = 0;
        else if (ans == -1 && s - arr[n-1][1] >= m) ans = arr[n-1][1];
        
        System.out.print(ans);
        br.close();
    }
}