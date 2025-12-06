import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long n = Long.parseLong(st.nextToken()), k = Long.parseLong(st.nextToken()), ans = 0;
		st = new StringTokenizer(br.readLine(), " ");
		long a = Long.parseLong(st.nextToken()), t = a+k;
		for (int i = 1; i < n; i++, t += k) {
			a = Long.parseLong(st.nextToken());
			
			if (a > t) {
				ans += (a - t) * i;
				t = a;
			} else {
				ans += t - a;
			}
		}
		
		System.out.println(ans);
        br.close();
    }
}