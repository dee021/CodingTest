import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Character, int[]> right = new HashMap<>(), left = new HashMap<>();
        String[] key = {"qwertyuiop", "asdfghjkl", "zxcvbnm"}; 
        
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < key[i].length(); j++) {
        		if (j >= (key[i].length() +1) /2) right.put(key[i].charAt(j), new int[] {i, j});
        		else left.put(key[i].charAt(j), new int[] {i, j});
        	}
        }
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        char l = st.nextToken().charAt(0), r = st.nextToken().charAt(0);
        int ans = 0;
        
        for (char c: br.readLine().toCharArray()) {
        	if (left.containsKey(c)) {
        		ans += count(left.get(l), left.get(c)) + 1;
        		l = c;
        	} else {
        		ans += count(right.get(r), right.get(c)) + 1;
        		r = c;
        	}
        }
        
        System.out.println(ans);
        br.close();
    }
    
    static int count(int[] cur, int[] next) {
    	return Math.abs(cur[0] - next[0]) + Math.abs(cur[1] - next[1]);
    }
}