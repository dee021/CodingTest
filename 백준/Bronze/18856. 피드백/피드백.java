import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        
        arr[0] = 1; arr[1] = 2;
        sb.append("1 2 ");
        
        for (int i = 2; i < n-1; i++) {
        	arr[i] = arr[i-1] +1;
        	sb.append(arr[i]).append(" ");
        }
        
        int k = arr[n-2];
        while (arr[n-1] == 0) {
        	k++;
        	if (isPrime(k)) arr[n-1] = k;
        }
        
        System.out.println(n);
        System.out.println(sb.toString() + arr[n-1]);
        br.close();
    }
    
    static boolean isPrime(int k) {
    	if (k % 2 == 0) return false;
    	int p = 3;
    	
    	while (p*p <= k) {
    		if (k%p == 0) return false;
    		p += 2;
    	}
    	
    	return true;
    }
}