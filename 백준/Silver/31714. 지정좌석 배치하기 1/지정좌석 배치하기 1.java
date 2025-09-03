import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
        int[] pre = new int [m], cur = new int [m];
        String ans = "YES";

        for (int i = 0; i < n; i++) {
        	boolean flag = true;
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int j = 0; j < m; j++) cur[j] = Integer.parseInt(st.nextToken());
        	Arrays.sort(cur);
        	for (int j = 0; j < m; j++) {
        		if (pre[j] >= cur[j] + d) {
        			flag = false;
        			break;
        		}
        		pre[j] = cur[j];
        	}
        	if (!flag)  {
        		ans = "NO";
        		break;
        	}
        }
        
        System.out.println(ans);
        br.close();
    }
}