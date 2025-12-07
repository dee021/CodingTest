import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        long n = Long.parseLong(st.nextToken()), m = Long.parseLong(st.nextToken()), M = 1_000_000_007;
		long a = 1, b = 1;
		
		for (int i = 0; i < n; i++) {
			a *= m;
			a %= M;
			b *= (m-1);
			b %= M;
		}
		
		System.out.println((a-b + M)%M);
        br.close();
    }
}