import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int sum = 0;
		for (int i = 0; i < 4; i++) sum += Integer.parseInt(st.nextToken());
		int target = Integer.parseInt(st.nextToken())*4;
		if (target > sum) System.out.println(target-sum);
		else System.out.println(0);
		br.close();
	}	
}