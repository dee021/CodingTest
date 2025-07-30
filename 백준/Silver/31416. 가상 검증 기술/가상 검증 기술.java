import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        
        int q = Integer.parseInt(br.readLine());
        
        while (q-- > 0) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int ta = Integer.parseInt(st.nextToken()), tb = Integer.parseInt(st.nextToken()), va = Integer.parseInt(st.nextToken()), vb = Integer.parseInt(st.nextToken());
        	sb.append(solution(ta, tb, va, vb)).append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
    
    static int solution(int ta, int tb, int va, int vb) {
    	int a = ta * va, b = tb * vb;
    	if (a <= b) {
    		return b;
    	}
    	
    	int min = Math.max(a, b), tmp;
    	for (int i = 0; i <= va; i++) {
    		tmp = Math.max(a - i*ta, b + i*ta);
    		if (min > tmp) min = tmp;
    	}
    	return min;
    }
}