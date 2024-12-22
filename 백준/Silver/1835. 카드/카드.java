import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Integer> list = new ArrayList();
		int n = Integer.parseInt(br.readLine()), idx;
		for (int i = n; i > 0; i--) {
			list.add(0, i);
			Collections.rotate(list, i);
		}

		for (int i = 0; i < n; i++) {
			if (i > 0) System.out.print(" ");
			System.out.print(list.get(i));
		}

		br.close();
	}	
}