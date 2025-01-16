import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int arr[] = new int[3];
		for (int i = 0; i < 3; i++) arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		long res = 1; int tmp;
		
		while (n > 0 && (arr[2] > 0 || arr[1] > 0) ) {
			if (arr[2] > 0) tmp = arr[2];
			else tmp = arr[1];
			
			for (int i = 0; i < tmp; i++) {
				res*=n;
				n--;
			}
			for (int i = tmp; i > 0; i--) res/=i;
			if (arr[2] > 0) arr[2]=0;
			else arr[1] = 0;
		}
		
		System.out.println(Math.round(res));
		br.close();
	}	
}