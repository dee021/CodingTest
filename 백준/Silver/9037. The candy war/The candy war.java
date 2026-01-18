import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine());
        
        while (tc-- > 0) {
        	int n = Integer.parseInt(br.readLine()), rnd = 0;
        	int[] arr = new int[n+1];
        	
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int i = 1; i < n+1; i++) {
        		arr[i] = Integer.parseInt(st.nextToken());
        		if (arr[i] % 2 > 0) arr[i]++;
        		arr[0] += arr[i];
        		
        	}
        	
        	do {
        		arr = round(n, arr);
        		if (arr[0] > 0) rnd++;
        	} while (arr[0] > 0);
        	
        	sb.append(rnd).append("\n");

        }
		
		System.out.print(sb);
        br.close();
    }
    
    static int[] round(int n, int[] arr) {
    	int t = arr[0]/n;
    	int[] res = new int[n+1];
    	boolean flag = arr[1] == t;
    	
    	res[1] = arr[1] / 2 + arr[n] / 2;
    	if (res[1] % 2 > 0) res[1]++;
    	res[0] = res[1];
    	
    	
    	for (int i = 2; i < n+1; i++) {
    		res[i] = arr[i-1]/2 + arr[i]/2;
    		if (res[i] % 2 > 0) res[i]++;
    		res[0] += res[i];
    		
    		if (flag && arr[i] != t) flag = false;
    	}
    	
    	if (flag) {
    		res[0] = 0;
    		return res;
    	}
    	return res;
    }
}