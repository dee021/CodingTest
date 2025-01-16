import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] count = {0, 11, 9,9,9,8,8,8,8,8,8};
		String[] solved = {"",
				"A B C D E F G H J L M",
				"A C E F G H I L M",
				"A C E F G H I L M",
				"A B C E F G H L M",
				"A C E F G H L M",
				"A C E F G H L M",
				"A C E F G H L M",
				"A C E F G H L M",
				"A C E F G H L M",
				"A B C F G H L M"
		};
		
		int n = Integer.parseInt(br.readLine());
		System.out.println(count[n]);
		System.out.println(solved[n]);

		br.close();
	}	
}