import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken()), z = Integer.parseInt(st.nextToken()) -1, m = Integer.parseInt(st.nextToken());	
		boolean[] arr = new boolean[n], visited;
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < m; i++) arr[Integer.parseInt(st.nextToken())-1] = true;
		
		int pos, min = z;
		boolean flag;
		for (int k = z-1; k > 0; k--) {
			flag = true;
			visited = new boolean[n];
			visited[(pos = 0)] = true;
			while (pos != z) {
				pos = (pos + k) % n;
				if (visited[pos] || arr[pos]) {
					flag = false;
					break;
				}
				visited[pos] = true;
			}
			if (flag) min = k;
		}
		
		System.out.println(min);
		br.close();
	}
}