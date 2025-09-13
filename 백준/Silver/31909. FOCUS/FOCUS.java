import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	static int[] robot = {0,1,2,3,4,5,6,7};
	static int[] arr = new int[8];

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr[0] = 1;
        for (int i = 1; i < 8; i++) arr[i] = arr[i-1] * 2;
        
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        while (n-- > 0) {
        	check(Integer.parseInt(st.nextToken()));
        }
        
        int key = Integer.parseInt(br.readLine());
        for (int i = 0; i < 8; i++) {
        	if (robot[i] == key) System.out.println(i);
        }
        
        br.close();
    }
    
    static void check(int x) {
    	
    	for (int i = 0; i < 7; i++) {
    		if (arr[i] > x) return;
    		for (int j = i +1; j < 8; j++) {
    			if (arr[i] + arr[j] == x) {
    				swap(i, j);
    				return;
    			}
    		}
    	}
    }
    
    static void swap(int i, int j) {
    	
    	int x = -1, y = -1;
    	
    	for (int k = 0; k < 8; k++) {
    		if (robot[k] == i) x = k;
    		if (robot[k] == j) y = k;
    	}
    	
    	int tmp = robot[x];
    	robot[x] = robot[y];
    	robot[y] = tmp;
    }
}