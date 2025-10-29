import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        
        System.out.println(insertion_sort(arr, k));
        
        br.close();
    }
    
    static int insertion_sort(int[] arr, int k) {
    	
    	for (int i = 1; i < arr.length; i++) {
    		int loc = i -1, elem = arr[i];
    		
    		while (0 <= loc && elem < arr[loc]) {
    			arr[loc +1] = arr[loc];
    			k--;
    			if (k == 0) return arr[loc];
    			loc--;
    		}
    		if (loc +1 != i) {
    			arr[loc +1] = elem;
    			k--;
    			if (k == 0) return elem;
    		}
    	}
    	
    	return -1;
    }
}