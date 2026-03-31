import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()), min = 601;
        
        while (n-- > 0) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int tmp = 0;
        	for (int i = 0; i < 3; i++) tmp += Integer.parseInt(st.nextToken());
        	if (tmp >= 512) min = Math.min(min, tmp);
        }
        
        System.out.println(min < 601? min: -1);
        br.close();
    }
}