import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int ans = 0, acc = 0;
        int[][] arr = new int[11][];
        for (int i = 0; i < 11; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	arr[i] = new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        }
        
        Arrays.sort(arr, (e1, e2) -> {
        	return e1[0] - e2[0];
        });
        
        for (int i = 0; i < 11; i++) {
        	acc += arr[i][0];
        	ans += acc + 20 * arr[i][1];
        }
        
		System.out.println(ans);
        br.close();
    }
}