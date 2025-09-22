import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder(), line = new StringBuilder();
        
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[101];
        Arrays.fill(arr, -1);
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	arr[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
        }
        
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
        	line.setLength(0);
        	boolean flag = true;
        	st = new StringTokenizer(br.readLine(), " ");
        	int m = Integer.parseInt(st.nextToken());
        	for (int j = 0; j < m; j++) {
        		int p = Integer.parseInt(st.nextToken());
        		if (arr[p] > -1) line.append(arr[p]).append(" ");
        		else {
        			flag = false;
        			break;
        		}
        	}
        	if (flag) sb.append(line.toString()).append("\n");
        	else sb.append("YOU DIED\n");
        }
        System.out.print(sb);
        br.close();
    }  
}