import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), max = 0, cnt = 0, idx;		
		boolean[] menu = new boolean[n+1];
		for (String m: br.readLine().strip().split(" ")) {
			idx = Integer.parseInt(m);
			if (menu[idx])cnt--;
			else max = Math.max(max, ++cnt);
			menu[idx]=!menu[idx];
		}
		System.out.println(max);
		br.close();
    }
}