import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), res = 0, l = 0;
        for (int i = 0; i < n; i++) {
        	l = 0;
        	for (char c: br.readLine().toCharArray()) {
        		if (c == '1') l = 0;
        		else {
        			l++;
        			if (l >= k) res++;
        		}
        	}
        }
        
        System.out.println(res);
        br.close();
    }
}