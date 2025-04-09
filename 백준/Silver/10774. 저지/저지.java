import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int j = Integer.parseInt(br.readLine()), a = Integer.parseInt(br.readLine());
		int[] size = new int[j+1];
		for (int i = 1; i <= j; i++) size[i] = conv(br.readLine());
		
		int cnt = 0, s, n;
		for (int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			s = conv(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			if (size[n] >= s) {
				cnt++;
				size[n] = -1;
			}
		}
		System.out.println(cnt);
		br.close();
	}
	
	static int conv(String input) {
		switch(input.charAt(0)) {
		case 'S':return 0;
		case 'M':return 1;
		default :return 2;
		}
	}
}