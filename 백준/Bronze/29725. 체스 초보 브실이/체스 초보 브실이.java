import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = arrayInit();
        int res = 0;
        
        for (int i = 0; i < 8; i++) {
        	for (char c:br.readLine().toCharArray()) {
        		if (c >= 'A' && c < 'a') res += arr[c - 'A'];
        		else if (c >= 'a') res -= arr[c - 'a'];
        	}
        }
        
        System.out.println(res);
        br.close();
    }
    
    static int[] arrayInit() {
    	int[] arr = new int[26], i = {1,3,3,5,9};
    	char[] c = "pnbrq".toCharArray();
    	
    	for (int j = 0; j < i.length; j++) arr[c[j] - 'a'] = i[j];
    	return arr;
    }
}