import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int w = Integer.parseInt(st.nextToken()), p = Integer.parseInt(st.nextToken());
        Set<Integer> hs = new HashSet<>();
        int[] partition = new int[p+2];
        partition[p+1] = w;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i < p+1; i++) partition[i] = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < p+1; i++) {
        	for (int j = i+1; j < p+2; j++) hs.add(partition[j] - partition[i]);
        }
        
        
        hs.remove(0);
        int[] res = new int[hs.size()];
        int idx = 0;
        for (int s:hs) {
        	res[idx++] = s;
        }
        
        Arrays.sort(res);
        
        for (int s:res)sb.append(s).append(" ");
        
        System.out.println(sb);
        br.close();
    }
}