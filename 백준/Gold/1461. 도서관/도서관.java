import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.PriorityQueue;
import java.util.Collections;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        PriorityQueue<Integer> pos = new PriorityQueue<>(Collections.reverseOrder()), neg = new PriorityQueue<>(Collections.reverseOrder());
        
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), po = 0, ne = 0, dis = 0;
        st = new StringTokenizer(br.readLine(), " ");
        
        for (int i = 0; i < n; i++) {
        	int l = Integer.parseInt(st.nextToken());
        	if (l > 0) {
        		pos.add(l);
        		po = Math.max(po, l);
        	} else {
        		neg.add(-l);
        		ne = Math.max(ne, -l);
        	}
        }
        
        while (!pos.isEmpty()) {
        	dis += pos.poll() * 2;
        	for (int i = 0; i < m-1 && !pos.isEmpty(); i++) pos.poll();
        }
        while (!neg.isEmpty()) {
        	dis += neg.poll() * 2;
        	for (int i = 0; i < m-1 && !neg.isEmpty(); i++) neg.poll();
        }
        
        if (ne <= po) {
        	dis -= po;
        } else {
        	dis -= ne;
        }
        
        System.out.println(dis);
        br.close();
    }
}