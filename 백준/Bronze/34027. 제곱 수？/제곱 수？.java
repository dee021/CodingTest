import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        
        int tc = Integer.parseInt(br.readLine());
        
        while (tc-- > 0) {
        	sb.append(bs(Integer.parseInt(br.readLine()))).append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
    
    static int bs(int n) {
    	int left = 1, right = 40_000;
    	
    	while (left <= right) {
    		int mid = (left + right) / 2, tmp = mid*mid;
    		
    		if (tmp < n) left = mid +1;
    		else if (tmp > n) right = mid -1;
    		else return 1;
    	}
    	return 0;
    }
}