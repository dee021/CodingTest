import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), m = Integer.parseInt(br.readLine()), t, x;
        int[] target = new int[m], score = new int[n+1];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) target[i] = Integer.parseInt(st.nextToken());
        
        for (int game = 0; game < m; game++) {
        	t = target[game];
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int i = 1; i < n+1; i++) {
        		x = Integer.parseInt(st.nextToken());
        		if (i == t || t != x) score[t]++;
        		else score[i]++;
        	}
        }
        
        for (int i = 1; i < n+1; i++) System.out.println(score[i]);
        
        br.close();
    }
}