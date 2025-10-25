import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        char[] NUM = "6174".toCharArray();
        int n = Integer.parseInt(br.readLine());
        
        while (n-- > 0) {
        	int cnt = 0;
        	char[] k = br.readLine().toCharArray();
        	
        	while (true) {
        		boolean b = true;
        		for (int i = 0;  i < 4; i++) if (k[i] != NUM[i]) b = false;
        		if (b) break;
        		
        		cnt++;
        		k = kaprekar(k);
        	}
        	
        	sb.append(cnt).append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
    
    static char[] kaprekar(char[] num) {
    	String min = "", max = "";
    	Arrays.sort(num);
    	
    	for (int i = 0; i < 4; i++) {
    		min += num[i];
    		max += num[3-i];
    	}
        
    	String res = String.valueOf(Integer.parseInt(max) - Integer.parseInt(min));
    	return ("0000".substring(res.length()) + res).toCharArray();
    }
}