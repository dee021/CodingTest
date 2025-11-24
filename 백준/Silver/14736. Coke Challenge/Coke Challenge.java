import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken()), min = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int t = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken());
        	min = Math.min(min, calc(k, a, t, s));
        }
        
        System.out.println(min);
        br.close();
    }
    
	static int calc(int k, int a, int t, int s) {
		int cnt = k / (a*t), rest = k % (a * t);
		int res = cnt * t + (cnt -1) * s;
		
		if (rest > 0) {
			res += s + rest / a;
		}
			
		return res;
	}
}