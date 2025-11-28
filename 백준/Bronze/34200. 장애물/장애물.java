import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), cur = 0, cnt = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        while (st.hasMoreTokens()) {
        	int t = Integer.parseInt(st.nextToken()), dis = t - cur;
        	if (dis < 1) { // 점프 후 장애물 밟음
        		cnt = -1;break;
        	}
        	cnt += (dis -1)/2 +1;
        	if (dis%2 == 0) cnt++;
        	
        	cur = t+1;
        }
        
        System.out.println(cnt);
        br.close();
    }
}