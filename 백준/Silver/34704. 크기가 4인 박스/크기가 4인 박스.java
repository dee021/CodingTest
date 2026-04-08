import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] size = new int[5];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
        	size[Integer.parseInt(st.nextToken())]++;
        }
        
        int cnt = size[4] + size[3] + size[2]/2;
        size[1] = Math.max(size[1] - size[3], 0) + (size[2] % 2 > 0? 2:0);
        cnt += size[1] / 4 + (size[1] % 4 > 0? 1: 0);
        
        System.out.println(cnt);
        br.close();
    }
}