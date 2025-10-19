import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	static int k, cnt = 0;
	static StringBuilder sb = new StringBuilder();
	
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        
        st = new StringTokenizer(br.readLine(), " ");
        
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        
        quick_sort(arr, 0, n-1);
        
        System.out.println(cnt >= k? sb: -1);
        br.close();
    }
    
    static void quick_sort(int[] arr, int p, int r) {
    	if (p < r && cnt < k) {
    		int q = partition(arr, p, r);
    		quick_sort(arr, p, q-1);
    		quick_sort(arr, q +1, r);
    	}
    }
    
    static int partition(int[] arr, int p, int r) {
    	int i = p - 1;
    	for (int j = p; j < r; j++) {
    		if (arr[j] <= arr[r]) {
    			i++;
    			swap(arr, i, j);
    		}
    	}
    	
    	if (i+1 != r) swap(arr, i+1, r);
    	
    	return i+1;
    }
    
    static void swap(int[] arr, int i, int j) {
		if (cnt < k) {
			cnt++;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
	    	if (cnt == k && sb.length() == 0) {
	    		for (int z = 0; z < arr.length; z++) sb.append(arr[z]).append(" ");
	    	}
		}
    }
}