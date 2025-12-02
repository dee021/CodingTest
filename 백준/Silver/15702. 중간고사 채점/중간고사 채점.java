import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), stu = 0, max = -1;
        
        st = new StringTokenizer(br.readLine(), " ");
        int[] score = new int[n];
        for (int i = 0; i < n; i++) score[i] = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < m; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int p = Integer.parseInt(st.nextToken()), s = 0;
        	for (int j = 0; j < n; j++) {
        		if (st.nextToken().equals("O")) s+= score[j];
        	}
        	if (s > max) {
        		max = s;
        		stu = p;
        	} else if (s == max) stu = Math.min(stu, p);
        }
        
        System.out.println(stu + " " + max);
        br.close();
    }
}