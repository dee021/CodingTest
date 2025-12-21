import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	static long[] arr;
	
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder(), tc = new StringBuilder();

        int n = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());;
        arr = new long[n+1];
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i < n+1; i++) arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        
        while (q-- > 0) {
        	sb.append(query(Arrays.asList(br.readLine().strip().split(" ")).stream().mapToInt(Integer::parseInt).toArray())).append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
    
    static long query(int[] q) {
    	long res = 0;
    	
    	if (q[0] == 1) {
    		res = arr[q[2]] - arr[q[1]-1];
    		long tmp = arr[q[2]] - arr[q[2]-1] - arr[q[1]] + arr[q[1]-1];
    		for (int i = q[1]; i < q[2]; i++) arr[i] += tmp;
    	} else {
    		res = arr[q[2]] - arr[q[1]-1] - (arr[q[4]] - arr[q[3]-1]);
    	}
    	
    	return res;
    }
}
