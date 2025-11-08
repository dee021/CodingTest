import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	static int[] arr;
	static int k;
	
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[n];
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        
        heap_sort(n-1);
        
        if (k > 0) System.out.println(-1);
        br.close();
    }
    
    static void heap_sort(int n) {
    	build_min_heap(n);
    	for (int i = n; i > 0; i--) {
    		
    		if (k <= 0) return;
    		swap(i, 0);
    		heapify(0, i-1);
    	}
    }
    
    static void build_min_heap(int n) {
    	for (int i = n/2; i >= 0; i--) {
    		heapify(i, n);
    	}
    }
    
    static void heapify(int root, int size) {
    	int left = 2 * root + 1, right = 2 * root + 2, smaller;
    	
    	if (right <= size) {
    		if (arr[left] < arr[right]) smaller = left;
    		else smaller = right;
    	} else if (left <= size) smaller = left;
    	else return ;
    	
    	if (arr[smaller] < arr[root]) {
    		if (k <= 0) return;
    		
    		swap(root, smaller);
    		heapify(smaller, size);
    	}
    }
    
    static void swap(int x, int y) {
    	if (k-- >= 0) {
    		int tmp = arr[y];
    		arr[y] = arr[x];
    		arr[x] = tmp;
    		
    		if (k == 0) {
    			System.out.println(Math.min(arr[x], arr[y]) + " " + Math.max(arr[x], arr[y]));
    		}
    	}
    }
}