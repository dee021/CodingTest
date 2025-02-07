import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	static BufferedReader br;
	
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()), no;
		ArrayList<Integer> router = new ArrayList<>();
		
		while (true) {
			no = Integer.parseInt(br.readLine());
			if (no == -1) break;
			if (no == 0) router.remove(0);
			else if (router.size() < n) router.add(no);
		}
		
		if (router.size() > 0) {
			for (int i = 0; i < router.size(); i++) sb.append(router.get(i) + " ");
		}
		else sb.append("empty");
		System.out.println(sb);

		br.close();
	}
}