import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static String a, p;
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		a = br.readLine().strip();
		p = br.readLine().strip();
		sb.append(p);
		if (p.length() > 1) sb = makeB(sb, 0);
		else while (sb.length() < a.length()) sb.append(p);
		
		System.out.println(sb);
		br.close();
	}
	
	
	private static StringBuilder makeB(StringBuilder sb, int k) {
		if (k != 0) sb.append(k);
		StringBuilder res;
		if (sb.length() < a.length()) {
			String str = sb.substring(sb.length() - p.length() + 1, sb.length());
			for (int i = 1; i < 10; i++) {
				if (a.indexOf(str+i) == -1){
					res = makeB(sb, i);
					if (res.length() == a.length()) return res;
				}
			}
		}
		return sb;
	}
}