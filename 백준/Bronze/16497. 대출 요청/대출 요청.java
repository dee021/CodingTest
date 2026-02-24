import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine()), max = 0;
        int[] day = new int[32];
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int s = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken());
        	for (int j = s; j < e; j++) {
        		day[j]++;
        		max = Math.max(max, day[j]);
        	}
        }
        
        System.out.println(Integer.parseInt(br.readLine()) >= max? 1: 0);
        br.close();
    }
}