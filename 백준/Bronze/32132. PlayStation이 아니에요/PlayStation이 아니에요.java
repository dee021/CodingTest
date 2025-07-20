import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        char[] input = br.readLine().toCharArray();
        sb.append(n >= 2?"" + input[0] + input[1]:input[0]);
        boolean ps = sb.toString().equals("PS");
        
        
        for (int i = 2; i < n; i++) {
        	if (ps) {
        		if (input[i] == '4' || input[i] == '5') continue;
        		else {
        			ps = false;
        		}
        	}
        	sb.append(input[i]);
        	
        	if (input[i-1] == 'P' && input[i] == 'S') ps = true;
        	
        }
        
        System.out.println(sb);
        br.close();
    }
}