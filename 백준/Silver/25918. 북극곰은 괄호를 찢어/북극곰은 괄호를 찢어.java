import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int n = Integer.parseInt(br.readLine()), maxLen = 0;
		String s = br.readLine().strip();
		ArrayDeque<Character> arrDeq = new ArrayDeque();
		
		for (char c : s.toCharArray()) {
			if (arrDeq.isEmpty()) arrDeq.add(c);
			else if (arrDeq.getLast() != c) {
				maxLen = Math.max(maxLen, arrDeq.size());
				arrDeq.pop();
			} else arrDeq.add(c);
		}

		System.out.println(arrDeq.isEmpty()?maxLen:-1);
		br.close();
	}
}