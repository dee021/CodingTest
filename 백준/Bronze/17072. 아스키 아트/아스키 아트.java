import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int j = 0; j < m; j++) {
        		int r = Integer.parseInt(st.nextToken()), g = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        		sb.append(intensity(r, g, b));
        	}
        	sb.append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
    
    public static char intensity(int r, int g, int b) {
    	int res = 2126 * r + 7152 * g + 722 * b;
    	if (res < 510_000) return '#';
    	if (res < 1_020_000) return 'o';
    	if (res < 1_530_000) return '+';
    	if (res < 2_040_000) return '-';
    	return '.';
    }
}