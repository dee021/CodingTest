import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()), cnt = 0;
        int[][] arr = new int[n][2];
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	arr[i] = new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        }
        
        Arrays.sort(arr, (e1, e2) -> {
        	if (e1[0] == e2[0]) return e1[1] - e2[1];
        	return e2[0] - e1[0];
        });
        
        for (int i = 5; i < n; i++) {
        	if (arr[i][0] == arr[4][0]) cnt++;
        	else break;
        }
        
        System.out.println(cnt);
        br.close();
    }
}