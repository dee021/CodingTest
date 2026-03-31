import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        long ans = 0;
        int[][] arr = new int[2][n];
        
        for (int i = 0; i < 2; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int j = 0; j < n; j++) arr[i][j] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
        	float temp = Float.parseFloat(st.nextToken());
        	int tmp = (int)(temp*10);
        	
        	if (tmp >= 10) ans += (arr[0][i] * tmp / 10) - arr[1][i];
        	else ans += arr[0][i] - (arr[1][i] * tmp / 10);
        }
        
        System.out.println(ans);
        br.close();
    }
}