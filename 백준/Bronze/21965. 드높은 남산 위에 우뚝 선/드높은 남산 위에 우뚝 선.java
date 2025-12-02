import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine())-1;
        boolean desc = false;
        String ans = "YES";
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int pre = Integer.parseInt(st.nextToken());
        
        while (n-- > 0) {
        	int cur = Integer.parseInt(st.nextToken());
        	if (pre < cur && desc) {
        		ans = "NO";
        		break;
        	} else if (pre == cur) {
        		ans = "NO";
        		break;
        	}else if (pre > cur && !desc) desc = true;
        	pre = cur;
        }
        
        System.out.println(ans);
        br.close();
    }
}