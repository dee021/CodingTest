import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), idx = 0;
        int[] arr = new int[n+1];
        
        for (int i = 0; i < n; i++) {
        	int k = Integer.parseInt(br.readLine());
        	if (k > arr[idx]) arr[++idx] = k;
        	else {
        		for (int j = idx -1; j >= 0; j--) {
        			if (k > arr[j]) {
        				arr[j+1] = k;
        				break;
        			}
        		}
        	}
        }
        
        System.out.println(n - idx);
        br.close();
    }
}