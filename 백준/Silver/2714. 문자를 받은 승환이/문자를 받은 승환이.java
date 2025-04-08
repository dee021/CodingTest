import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[][] d = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; 
	static char limit = (char)('A' - 1);
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int tc = Integer.parseInt(br.readLine()), r, c;
		char[][] arr;
        
		for (int t = 0; t < tc; t++) {
			st = new StringTokenizer(br.readLine(), " ");
			r = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			arr = new char[r][c];
			String str = st.nextToken();
			for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) arr[i][j] = str.charAt(i*c + j);
			sb.append(getMsg(r, c, arr)).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
	
	static String getMsg(int r, int c, char[][] arr) {
		int x = -1, y = 0, dr = 0, xx, yy;
		StringBuilder text = new StringBuilder();
		StringBuilder bit = new StringBuilder();
		char res;
		
		for (int i = 0; i < r*c; i++) {
			xx = x + d[dr][1];
			yy = y + d[dr][0];
			if (0 <= xx && xx < c && 0 <= yy && yy < r && arr[yy][xx] != ' ') {
				bit.append(arr[yy][xx]);
				y = yy; x = xx;
				arr[y][x] = ' ';
				if (bit.length() == 5) {
					res = (char)(Integer.parseInt(bit.toString(), 2) -1 + 'A');
					text.append(res > limit?res:' ');
					bit.setLength(0);
				}
			} else {
				dr = (dr+1)%4;
				i--;
			}
		}
		return text.toString().stripTrailing();
	}
}