import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        while (n-- > 0) {
        	int level = Integer.parseInt(st.nextToken());
        	if (level == 300) sb.append("1 ");
        	else if (level >= 275) sb.append("2 ");
        	else if (level >= 250) sb.append("3 ");
        	else sb.append("4 ");
        }
        
        System.out.println(sb);
        br.close();
    } 
}