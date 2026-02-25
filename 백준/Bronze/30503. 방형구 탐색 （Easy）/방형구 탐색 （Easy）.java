import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i < n+1; i++) arr[i] = Integer.parseInt(st.nextToken());
        
        int q = Integer.parseInt(br.readLine());
        while(q-- > 0) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int o = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken());
        	
        	if (o == 1) sb.append(count(arr, s, e, Integer.parseInt(st.nextToken()))).append("\n");
        	else {
        		for (int i = s; i <= e; i++) {
        			if (arr[i] > 0) arr[i] = -e+i;
        			else arr[i] -= e - i + arr[i];
        		}
        	}
        }
        System.out.print(sb);
        br.close();
    }
    
    static int count(int[] arr, int s, int e, int t) {
    	int res = 0;
    	for (int i = s; i <= e; i++) {
    		if (arr[i] == t) res++;
    		if (arr[i] <= 0) i -= arr[i];
    	}
    	return res;
    }
}