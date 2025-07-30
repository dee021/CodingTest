import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        
        int n = Integer.parseInt(br.readLine());
        long row = 0, total = 0;
        long[] rows = new long[n];
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	row = 0;
        	for (int j = 0; j < n; j++) row += Long.parseLong(st.nextToken());
        	rows[i] = row;
        	total += row;
        }
        
        if (n == 2) {
        	long e = rows[0]/2;
        	sb.append(e).append(" ").append(rows[0] - e);
        } else {
        	long t = total/((n-1) * 2);
        	for (int i = 0; i < n; i++) {
        		long e = (rows[i] - t)/(n-2);
        		sb.append(e).append(" ");
        	}
        }
        System.out.println(sb);
        br.close();
    } 
}