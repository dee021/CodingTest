import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        long ans = 0;
        long[] fx = new long[n]; 
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	fx[i] = Long.parseLong(st.nextToken());
        	ans += Long.parseLong(st.nextToken());
        }
        
        Arrays.sort(fx);
        
        for (int i = 0; i < n; i++) {
        	ans += fx[i] * (i+1);
        }

        System.out.println(ans);
        br.close();
    }
}