import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine()), max = 0;
        String name = "";
        
        while (n-- > 0) {
        	st = new StringTokenizer(br.readLine(), " ");
        	String nm = st.nextToken();
        	int s = Integer.parseInt(st.nextToken());
        	
        	if (max < s) {
        		max = s;
        		name = nm;
        	} else if (max == s && nm.compareTo(name) < 0) {
        		name = nm;
        	}
        }
        
        System.out.println(name);
        br.close();
    }
}