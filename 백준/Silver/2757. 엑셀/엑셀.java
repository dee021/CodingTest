import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			String input = br.readLine();
			int idx = input.indexOf('C');
			int r = Integer.parseInt(input.substring(1, idx)), c = Integer.parseInt(input.substring(idx+1));
			if (r == 0 && c == 0) break;
			sb.append(conv(c)).append(r).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
	
	static String conv(int c) {
		ArrayList<Integer>  al = new ArrayList();
		while (c > 25) {
			al.add(c%26);
			c /= 26;
		} if(c > 0) al.add(c);
		
		int tmp = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) <= tmp && i == al.size()-1) break;
			else if (al.get(i) <= tmp){
				sb.append((char)(al.get(i) + 'A' - tmp +25));
				tmp = 1;
			} else {
				sb.append((char)(al.get(i) + 'A' - tmp - 1));
				tmp = 0;
			}
		}
		return sb.reverse().toString();
	}
}