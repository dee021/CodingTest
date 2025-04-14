import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), max = 0, cnt;
		long[][] arr = new long[n][3];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 2; j++) arr[i][j] = Long.parseLong(st.nextToken());
			arr[i][2] = arr[i][0] + arr[i][1];
		}
        
        Arrays.sort(arr, (elem1, elem2) -> elem1[2] > elem2[2]?1:-1);

		long res;
        for (int c = 0; c < n; c++) {
        	if (arr[c][0]/2 + arr[c][1] <= b) {
        		cnt = 1;
        		res = arr[c][0]/2 + arr[c][1];
        	} else {
        		cnt = 0;
        		res = 0;
        	}
        	for (int i = 0; i < n; i++) {
        		if (i == c) continue;
        		if (res + arr[i][2] <= b) {
        			cnt++;
        			res += arr[i][2];
        		}
        	}
        	max = Math.max(max, cnt);
        }
		
		System.out.println(max);
		br.close();
	}
}