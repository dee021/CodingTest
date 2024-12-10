import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[3];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[Integer.parseInt(st.nextToken())+1]++;
		}
		
		if (arr[1] >= n/2.0) System.out.println("INVALID");
		else if (arr[0] < arr[2]) System.out.println("APPROVED");
		else System.out.println("REJECTED");

		br.close();
	}	
}