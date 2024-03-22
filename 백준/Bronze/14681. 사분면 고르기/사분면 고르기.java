import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class input {
	int conv(int a) {
		if (a > 0)
			return 1;
		else
			return 0;
	}
}

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		input ip = new input();
		int ans[][] = {{3, 4}, {2, 1}}; // [y][x]

		int x = ip.conv(Integer.parseInt(br.readLine()));
		int y = ip.conv(Integer.parseInt(br.readLine()));
		System.out.println(ans[y][x]);
	}
}