import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), res = 0, day = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i< n; i++) pq.add(Integer.parseInt(br.readLine()));
        
        while (!pq.isEmpty()) {
        	day++;
        	int j = pq.poll();
        	res = res/2 + j;
        	if (j - m > k) pq.add(j-m);
        	sb.append(res).append("\n");
        }
        
        System.out.println(day);
        System.out.println(sb);
        
        br.close();
    }
}