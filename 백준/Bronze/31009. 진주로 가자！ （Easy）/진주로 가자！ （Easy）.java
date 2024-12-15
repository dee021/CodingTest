import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] cost = new int[1001];
		int jinju = 0, count = 0;
		String city; int c;
		for (int i =0; i <n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			city = st.nextToken();
			c = Integer.parseInt(st.nextToken());
			cost[c]++;
			if (city.equals("jinju")) jinju = c;
		}
		
		for (int i=jinju+1; i < 1001; i++) {
			count += cost[i];
		}
		
		System.out.println(jinju);
		System.out.println(count);

		br.close();
	}	
}