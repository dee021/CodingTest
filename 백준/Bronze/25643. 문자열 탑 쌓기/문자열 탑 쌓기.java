import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), res = 1;
        StringBuilder pre = new StringBuilder(br.readLine()), cur;

        while (n-- > 1) {
        	cur = new StringBuilder(br.readLine());
        	if (!check(m, pre.toString(), cur.toString())) {
        		res = 0;
        		break;
        	}
        	pre = new StringBuilder(cur.toString());
        }
        
        System.out.println(res);
        
        br.close();
    }
    
    static boolean check(int m, String word1, String word2) {
    	int idx1 = 0, idx2 = m-1;
    	
        while (idx1 < m || idx2 > 0) {
    		int x = idx1, y = idx2;
			boolean flag = true;
			while (x < m && y < m) {
				if (word1.charAt(x) != word2.charAt(y)) {
					flag = false;
					break;
				}
				x++;y++;
			}
			if (flag) return true;
			if (idx2 > 0) idx2--;
			else idx1++;
    	}
    	
    	return false;
    }
}
