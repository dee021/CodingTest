import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[][] d = {{0,1}, {1,0}, {0,-1}, {-1, 0}};
		int n = Integer.parseInt(br.readLine()), x = 0, y = 0, h = 1, idx = 0;
		int dx = d[idx][0], dy = d[idx][1];
		
		while (n-- > 0) {
			if ((idx == 0 && h == y && -x == y -1) || (idx != 0 && (x == y || x == -y))) {
				idx = (idx+1)%4;
				dx = d[idx][0];
				dy = d[idx][1];
				if (idx == 0) h++;
			}
			x += dx;
			y += dy;
		}
		
		System.out.println(x + " " + y);
		br.close();
	}
}