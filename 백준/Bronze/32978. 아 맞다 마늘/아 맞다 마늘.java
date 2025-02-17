import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Set<String> s = new HashSet();
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n ;i++) s.add(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n-1; i++) s.remove(st.nextToken());
		
		System.out.println(s.toArray()[0]);
		br.close();
	}
}