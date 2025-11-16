import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	static long[][] arr;
	
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine()), a = 0, b = 0;
        arr = new long[n][2];
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	arr[i][0] = Long.parseLong(st.nextToken());
        	arr[i][1] = Long.parseLong(st.nextToken());
        }
        
        long rss = Long.MAX_VALUE, res;
        for (int i = 1; i <= 100; i++) {
        	for (int j = 1; j <= 100; j++) {
        		res = RSS(n, i, j);
        		if (rss > res) {
        			rss = res;
        			a = i;
        			b = j;
        		}
        	}
        }
        
		System.out.println(a + " " + b);
        br.close();
    }
    
    static long RSS(int n, int a, int b) {
    	long res = 0;
    	for (int i = 0; i < n; i++) {
    		res += Math.pow((arr[i][1] - arr[i][0] * a - b),2);
    	}
    	return res;
    }
}