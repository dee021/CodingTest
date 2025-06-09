import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Map;
import java.util.HashMap;

public class Main {
	static Map<Character, int[]> map = new HashMap<>();
	
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        mapInit(0, 0, "QWERTYUIOP".toCharArray());
        mapInit(1, 1, "ASDFGHJKL".toCharArray());
        mapInit(2, 2, "ZXCVBNM".toCharArray());
        
        
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
        	int res = 0, prev = ' ';
        	int[] t1 = {0,0}, t2;
        	for (char k: br.readLine().toCharArray()) {
        		if (prev != ' ') {
        			t2 = map.get(k);
        			res += Math.abs(t1[0] - t2[0]) + Math.abs(t1[1] - t2[1]);
        			if(Math.abs(t1[0] - t2[0]) == 2 && t1[1] == t2[1]) res += 2;
        		}
        		res++;
        		prev = k;
        		t1 = map.get(k);
        	}
        	sb.append(res).append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
    
    static void mapInit(int line, int pos, char[] key) {
    	for (char c: key) {
    		map.put(c, new int[] {line, pos});
    		pos += 2;
    	}
    }
}