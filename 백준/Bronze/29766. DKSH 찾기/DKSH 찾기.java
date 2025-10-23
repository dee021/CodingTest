import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        String text = br.readLine();

        for (int idx = 0; idx + 3 < text.length(); idx++) {
        	String sub = text.substring(idx, idx+4);
        	
        	if (sub.equals("DKSH")) {
        		cnt++; idx+=3;
        	} else if (sub.lastIndexOf('D') > 0) idx += sub.lastIndexOf('D') -1;
        	else idx += 3;
        }
        
        System.out.println(cnt);
        br.close();
    }
}
