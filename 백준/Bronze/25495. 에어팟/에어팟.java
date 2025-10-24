import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), con = 0, bat = 0, prev = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for (int i = 0; i < n; i++) {
        	int p = Integer.parseInt(st.nextToken());
        	if (con == p) {
        		prev *= 2;
        		bat += prev;
        	} else {
        		bat += 2;
        		prev = 2;
        		con = p;
        	}
            
            if (bat >= 100) {
        		bat = 0;
        		con = 0;
        	}
        }
        
        System.out.println(bat);
        br.close();
    }
}