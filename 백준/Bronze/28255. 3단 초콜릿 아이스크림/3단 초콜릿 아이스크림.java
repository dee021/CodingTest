import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
        	int ans = 0;
        	String icecream = br.readLine();
        	String ice = icecream.substring(0, (icecream.length()+2)/3);
        	if (icecream.equals(ice + rev(ice) + ice)) ans = 1;
        	else if (icecream.equals(ice + tail(rev(ice)) + ice)) ans = 1;
        	else if (icecream.equals(ice + rev(ice) + tail(ice))) ans = 1;
        	else if (icecream.equals(ice + tail(rev(ice)) + tail(ice))) ans = 1;
        	sb.append(ans).append("\n");
        }
        
        System.out.println(sb);
        br.close();
    }
    
    static String rev(String s) {
    	StringBuilder sb = new StringBuilder();
    	for (int i = s.length()-1; i > -1; i--) sb.append(s.charAt(i));
    	return sb.toString();
    }
    
    static String tail(String s) { 
    	return s.substring(1);
    }
}