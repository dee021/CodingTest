import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine()), s = 0, t = 0;
        String stst = br.readLine();
        int max = stst.length()-1;
        
        for (int i = stst.length()-1; i > -1; i--) {
        	if (stst.charAt(i) == 's') s++;
        	else t++;
        	
        	if (s == t) max = i;
        }
        
        System.out.println(stst.substring(max));
        
        br.close();
    }
}