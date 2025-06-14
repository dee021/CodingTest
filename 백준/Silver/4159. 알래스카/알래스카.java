import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        while (true) {
        	int n = Integer.parseInt(br.readLine()), cur = 0;
        	boolean flag = true;
        	if (n == 0) break;
        	pq.clear();
        	
        	for (int i = 0; i < n ; i++) pq.add(Integer.parseInt(br.readLine()));
        	
        	for (int i = 0; i < n; i++) {
        		int d = pq.poll();
        		if (cur + 200 < d) {
        			flag = false;
        			break;
        		}
        		cur = d;
        	}
        	
        	if (!flag || cur + 100 < 1422) sb.append("IMPOSSIBLE\n");
        	else sb.append("POSSIBLE\n");
        }
        System.out.print(sb);
        br.close();
    }
}