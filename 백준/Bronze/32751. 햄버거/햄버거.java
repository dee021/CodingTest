import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); 
        int[] cnt = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) cnt[i] = Integer.parseInt(st.nextToken());
        
        char[] bg = br.readLine().toCharArray(); char prev = bg[0];
        boolean res = cnt[prev - 'a'] >= 0 && prev == 'a'; 
        
        for (int i = 1; i < n && res; i++) {
        	if (prev == bg[i]) res = false;
        	prev = bg[i];
        	if (--cnt[prev-'a'] < 0) res = false;
        }
        
        System.out.println(res && bg[n-1] == 'a'?"Yes":"No");
        br.close();
    }
}