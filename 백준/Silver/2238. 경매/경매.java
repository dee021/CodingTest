import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int u = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken()), min = -1;
        int[] cnt = new int[u+1]; 
        String[] name = new String[u+1];
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	String nm = st.nextToken();
        	int p = Integer.parseInt(st.nextToken());
        	cnt[p]++;
        	if (cnt[p] == 1) name[p] = nm;
        }
        
        for (int i = u; i > 0; i--) {
        	if (cnt[i] > 0) {
        		if (min == -1) min = i;
        		else if (cnt[i] <= cnt[min]) min = i;
        	}
        }
        
        System.out.println(name[min] + " " + min);
        br.close();
    }
}