import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine()), score = -1, cnt = 51, last = 180, no = 0;
        
        for (int i = 1; i <= n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int s = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken());
        	
        	if (score < s) {
        		score = s; cnt = c; last = l; no = i;
        	} else if (score == s && cnt > c) {
        		cnt = c; last = l; no = i;
        	} else if (score == s && cnt == c && last > l) {
        		last = l; no = i;
        	}
        }
        
        System.out.println(no);
        br.close();
    }
}