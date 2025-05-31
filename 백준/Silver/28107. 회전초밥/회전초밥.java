import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        ArrayDeque<Integer> ad;
        Map<Integer, ArrayDeque<Integer>> wish = new HashMap<>();
        
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int j = Integer.parseInt(st.nextToken());
        	while (j-- > 0) {
        		int sushi = Integer.parseInt(st.nextToken());

        		ad = wish.getOrDefault(sushi, new ArrayDeque<Integer>());
        		ad.add(i);
        	
        		wish.put(sushi, ad);
        	}
        }
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
        	Integer idx = wish.getOrDefault(Integer.parseInt(st.nextToken()), new ArrayDeque<Integer>()).poll();
        	if (idx != null) answer[idx]++;
        }
        
        for (int i = 0; i < n; i++) sb.append(answer[i]).append(" ");

        System.out.println(sb);
        br.close();
    } 
}