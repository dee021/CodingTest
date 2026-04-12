import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[][] arr = new int[3][2]; arr[0][1] = 25000;
        for (int i = 0; i < 3; i++) arr[i][0] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        arr[1][1] = Integer.parseInt(st.nextToken())*30;
        arr[2][1] = Integer.parseInt(st.nextToken())*30;
        int exp = (250-Integer.parseInt(br.readLine())) * 100, ans = 0;
        
        Arrays.sort(arr, (e1, e2) -> {
        	return e2[0] - e1[0];
        });
        
        for (int i = 0; i < 3 && exp > 0; i++) {
        	if (arr[i][0] * arr[i][1] <= exp) {
        		ans += arr[i][1];
        		exp -= arr[i][0] * arr[i][1];
        	} else {
        		while (exp > 0 && arr[i][1] > 0) {
        			ans++;
        			exp -= arr[i][0];
        			arr[i][1]--;
        		}
        	}
        }
        
        System.out.println(ans);
        br.close();
    }
}