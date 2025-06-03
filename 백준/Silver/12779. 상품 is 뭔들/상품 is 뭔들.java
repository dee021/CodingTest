import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken());
        long t = b-a, c = (binSearch(b) - binSearch(a));
        
        if (c == 0) System.out.println(0);
        else {
        	long gcd = gcd(t, c);
        	System.out.println((c/gcd) + "/" + (t/gcd));
        }
        br.close();
    }
    
    private static long gcd(long a, long b) {
		long max = Math.max(a, b), min = Math.min(a, b), tmp;
		
		while (min > 0) {
			tmp = max % min;
			max = min;
			min = tmp;
		}
		return max;
	}
    
    private static long binSearch(long num) {
    	long left = 0, right = Integer.MAX_VALUE;
    	while (left <= right) {
    		long mid = (left + right) / 2;
    		long f = mid*mid, u = (mid+1) * (mid+1);
    		if (num >= f && u > num) return mid;
    		if (mid*mid > num) right = mid-1;
    		else left = mid+1;
    	}
    	return left;
    }
}