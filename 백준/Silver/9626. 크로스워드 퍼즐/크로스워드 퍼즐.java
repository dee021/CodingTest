import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int u = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
        
        String str = "";
        StringBuilder sb = new StringBuilder();
        for (int y = 0; y < u + d + m; y++) {
        	if (y >= u && y < u+m) str = br.readLine();
        	for (int x = 0; x < r + l + n; x++) {
        		if (!str.isEmpty() && x == l) {
        			sb.append(str);
        			x += str.length()-1;
        			str = "";
        		} else sb.append((x+y)%2 > 0?'.':'#');
        	}
        	sb.append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}