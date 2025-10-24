import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder(), tc = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        while (n > 0) {
        	
        	tc.setLength(0);
        	float max = 0.0f;
        	
        	for (int i = 0; i < n; i++) {
        		st = new StringTokenizer(br.readLine(), " ");
        		String name = st.nextToken();
        		float height = Float.parseFloat(st.nextToken());
        		
        		if (max < height) {
        			tc.setLength(0);
        			max = height;
        			tc.append(name);
        		} else if (max == height) {
        			tc.append(" ").append(name);
        		}
        	}
        	
        	sb.append(tc.toString()).append("\n");
        	n = Integer.parseInt(br.readLine());
        }
        
        System.out.print(sb);
        br.close();
    }
}