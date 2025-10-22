import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	static int[] cnt1 = new int[5], cnt2 = new int[5];
	
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        StringBuilder sb1 = new StringBuilder(conv(n, br.readLine().toCharArray(), 1));
        StringBuilder sb2 = new StringBuilder(conv(n, br.readLine().toCharArray(), 2));
        
        boolean flag = sb1.toString().equals(sb2.toString());
        
        for (int i = 0; i < 5; i++) flag &= cnt1[i] == cnt2[i];
        
        System.out.println(flag? "YES": "NO");
        br.close();
    }
    
    static String conv(int n, char[] arr, int cnt) {
    	StringBuilder sb = new StringBuilder();
    	sb.append(arr[0]);
    	
    	for (int i = 1; i < n-1; i++) {
    		if ("aeiou".indexOf(arr[i]) < 0) sb.append(arr[i]);
    		else if (cnt == 1) cnt1["aeiou".indexOf(arr[i])]++;
    		else cnt2["aeiou".indexOf(arr[i])]++;
    	}
    	
    	return sb.toString() + arr[n-1];
    }
}