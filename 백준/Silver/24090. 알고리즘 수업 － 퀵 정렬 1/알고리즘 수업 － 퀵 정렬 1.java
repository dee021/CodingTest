import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	static int n = 0, k = 0;
	static int[] arr;
	
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken()); k = Integer.parseInt(st.nextToken());
        arr = new int[n];
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        
        quick_sort(0, n-1);
        
        if (k > 0) System.out.println(-1);
        br.close();
    }
    
	static void quick_sort(int p, int r) {
		if (p < r && k > 0) {
			int q = partition(p, r);
			quick_sort(p, q-1);
			quick_sort(q+1, r);
		}
	}
	
	static int partition(int p, int r) {
		int x = arr[r], i = p-1;
		
		for (int j = p; j < r; j++) {
			
			if (arr[j] <= x) {
				swap(++i, j);
			}
		}
		
		if (i+1 < r) swap(i+1, r);
		return i+1;
	}
	
	static void swap(int x, int y) {
		if (k > 0) {
			k--;
			int tmp = arr[x];
			arr[x] = arr[y];
			arr[y] = tmp;
			if (k == 0) System.out.println(Math.min(arr[x], arr[y]) + " " + Math.max(arr[x], arr[y]));
		}
	}
}