import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        long dis = 0, sec = 0;
        int[][] arr= new int[k][3];
        
        for (int i = 0; i < k; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int j = 0; j < 3; j++) arr[i][j] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr, (e1, e2) -> {
        	return e1[0] - e2[0];
        });
        
        for (int i = 0; i < k; i++) {
        	int x = arr[i][0], t = arr[i][1], s = arr[i][2];
        	sec += x - dis;
        	dis = x;
        	
        	// [0, s) : r
        	// [s, s+t) : g
        	// [s+t, s+2*t) : r
        	
        	long light = (sec - s) % (2 * t);
        	if (sec < s) {
        		sec = s;
        	} else if (t <= light) {
        		sec += 2*t - light;
        	}
        }
        
		System.out.println(sec + n - dis);
        br.close();
    }
    
}