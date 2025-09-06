import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        int[] grade = {-1, 4, 11, 23, 40, 60, 77, 89, 96, 100};
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < k; i++) {
        	int s = Integer.parseInt(st.nextToken()), res = s * 100 / n;
        	for (int g = 1; g < grade.length; g++) {
        		if (grade[g-1] < res && res <= grade[g]) {
        			sb.append(g).append(" ");
        			break;
        		}
        	}
        	
        }
        
        System.out.print(sb);
        br.close();
    }
}