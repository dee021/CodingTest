import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	static long gap = Long.MAX_VALUE, ans;
	static String n;
	static boolean[] nums = new boolean[10];
	
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = br.readLine();
        if (Long.parseLong(n) < 10) ans = Long.parseLong(n);
        else bf("");
        
        System.out.println(ans);
        br.close();
    }
    
    static void bf(String res) {
    	if (res.length() == n.length() || res.length() == 10) {
    		check(Long.parseLong(res));
    		return ;
    	}
    	
    	for (int i = 0; i < 10; i++) {
    		if (!nums[i]) {
    			nums[i] = true;
    			bf(res + i);
    			nums[i] = false;
    		}
    	}
    }
    
    static void check(Long res) {
    	long cur = Math.abs(res - Long.parseLong(n));
    	if (cur < gap) {
    		gap = cur;
    		ans = res;
    	} else if (Long.compare(cur, gap) == 0) {
    		ans = Math.min(ans, res);
    	}
    }
}