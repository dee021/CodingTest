import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[6];
        
        for (int i = 1; i < 6; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int cnt = arr[5];;
        
        if (arr[4] > 0) {
        	cnt += arr[4];
        	arr[1] = Math.max(arr[1] - arr[4], 0);
        }
        
        if (arr[3] > 0) {
        	cnt += arr[3];
        	
        	if (arr[2] >= arr[3]) {
        		arr[2] -= arr[3]; arr[3] = 0;
        	} else {
        		arr[3] -= arr[2]; arr[2] = 0;
        		arr[1] = Math.max(0, arr[1]-arr[3]*2);
        	}
        }
        
        if (arr[2] > 0) {
        	cnt += arr[2] / 2;
        	arr[1] = Math.max(0, arr[1] - (arr[2] / 2));
        	if (arr[2] % 2 == 1) {
        		cnt++;
        		arr[1] -= 3;
        	}
        }
        
        if (arr[1] > 0) {cnt += (arr[1] + 4) / 5;}
        
		System.out.println(cnt);
        br.close();
    }
}