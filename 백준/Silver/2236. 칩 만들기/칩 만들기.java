import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        int[][] inputs = new int[n][2];
        int[] sorted = new int[n];
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
        	inputs[i][0] = i;
        	inputs[i][1] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(inputs, (elem1, elem2) -> {
        	return elem2[1] - elem1[1];
        });
        
        int idx = 0;
        for (int m = 0; m < k; m++) {
        	if (idx >= n) {
        		sb.append("0\n");
        		continue;
        	}
        	sb.append(inputs[idx][0]+1).append("\n");
        	sorted[inputs[idx][0]] = inputs[idx][0]+1;
        	idx++;
        }
        
        for (int i = 0; i < n; i++) sb.append(sorted[i]).append("\n");
        System.out.println(sb);
        br.close();
    } 
}