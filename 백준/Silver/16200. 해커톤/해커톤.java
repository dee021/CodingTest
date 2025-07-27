import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int n = Integer.parseInt(br.readLine()), team = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) pq.add(Integer.parseInt(st.nextToken()));
        
        while (!pq.isEmpty()) {
        	team++;
        	int cnt = pq.poll()-1;
        	while (cnt-- > 0) pq.poll();
        }
        
        System.out.println(team);
        br.close();
    }
}