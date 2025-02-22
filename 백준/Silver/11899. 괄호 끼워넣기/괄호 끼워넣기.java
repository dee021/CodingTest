import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine().strip();
		ArrayDeque<Character> arrDeq = new ArrayDeque();
		
		for (char c: s.toCharArray()) {
			if (!arrDeq.isEmpty() && c == ')' && arrDeq.getLast() == '(') arrDeq.pollLast();
			else arrDeq.add(c);
		}
		
		System.out.println(arrDeq.size());
		br.close();
		
	}
}