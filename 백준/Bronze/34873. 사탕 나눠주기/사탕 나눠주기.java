import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] candy = new int[2*n+1];
        boolean ans = true;
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 2*n; i++) {
        	int c = Integer.parseInt(st.nextToken());
        	candy[c]++;
        	if (candy[c] > 2) {
        		ans = false;break;
        	}
        }
        
        System.out.println(ans? "Yes": "No");
        br.close();
        
    }
}