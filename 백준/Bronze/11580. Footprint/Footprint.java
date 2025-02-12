import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Map;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()), cnt = 1, r = 0, c = 0;
		Map<String, Integer> visited = new HashMap<>();
        visited.put(r + " " + c, 1);
		String input = br.readLine().strip();
		for (char d: input.toCharArray()) {
			switch(d) {
			case 'E':
				c++;
				break;
			case 'W':
				c--;
				break;
			case 'S':
				r++;
				break;
			case 'N':
				r--;
				break;
			}
			if (!visited.containsKey(r + " " + c)) {
				visited.put(r + " " + c,1);
				cnt++;
			}
		}

		System.out.println(cnt);
		br.close();
	}
}