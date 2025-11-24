import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), sum = 0;
        int[] cnt = new int[n+1], arr = new int[n*k+1];
        
        for (int i = 1; i < n*k+1; i++) {
        	int x = i - sum;
        	if (0 < x && x <= n && cnt[x] < k) {
        		cnt[x]++;
        		arr[i] = x;
        		sum += x;
        	} else if (i == n*k) {
        		for (int j = n; j > 0; j--) if (cnt[j] < k) arr[i] = j;
        	}else {
        		sb.setLength(0);
        		sb.append(-1);
        		break;
        	}
        	sb.append(arr[i]).append(" ");
        }
        
        System.out.println(sb);
        br.close();
    }
}