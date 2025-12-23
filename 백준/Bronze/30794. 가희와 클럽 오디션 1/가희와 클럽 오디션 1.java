import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int lv = Integer.parseInt(st.nextToken()), score = 0;
        String[] w = {"miss", "bad", "cool", "great", "", "perfect"};
        String space = st.nextToken();
        
        for (int i = 0; i < w.length; i++) {
        	if (space.equals(w[i])) {
        		score = i * 200 * lv;
        		break;
        	}
        }
        
        System.out.println(score);
        br.close();
    }
}