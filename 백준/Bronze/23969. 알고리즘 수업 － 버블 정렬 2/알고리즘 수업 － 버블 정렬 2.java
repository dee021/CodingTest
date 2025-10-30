import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	static int k;
	static int[] arr;
	
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[n];
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        
        bubble_sort();
        
        if (k > 0) sb.append(-1);
        else {
        	for (int i = 0; i < n; i++) sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
        br.close();
    }
    
    static void bubble_sort() {
    	for (int i = arr.length -1; i > 0; i--) {
    		for (int j = 0; j < i; j++) {
    			if (arr[j] > arr[j+1] && k > 0) {
    				swap(j);
    				k--;
    			}
    		}
    	}
    	return ;
    }
    
    static void swap(int j) {
    	int tmp = arr[j+1];
    	arr[j+1] = arr[j];
    	arr[j] = tmp;
    	return ;
    }
}