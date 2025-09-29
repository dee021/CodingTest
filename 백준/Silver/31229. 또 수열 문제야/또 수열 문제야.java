import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(), line = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        arr[0] = 1;
        
        for (int i = 1; i < n; i++) {
        	num: for (int j = arr[i-1]+1; j < 1_000_000_000; j++) {
        		for (int k = 0; k < i; k++) {
        			if (!check(arr[k], j)) continue num;
        		}
        		arr[i] = j;
        		break;
        	}
        }
        
        for (int i = 0; i < n; i++)sb.append(arr[i]).append(" ");
        
        System.out.println(sb);
        br.close();
    }
    
    static boolean check(int a, int b) {
    	int s = a+b, m = a*b;
    	if (m%s == 0) return false;
    	return true;
    }
}