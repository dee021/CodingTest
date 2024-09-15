import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ipv6 = br.readLine().strip();
		if (ipv6.contains("::")) {
			String tmp = ":";
			int cnt = count(ipv6);
			while (tmp.length() < 9-cnt)tmp +=":";
			ipv6 = ipv6.replace("::", tmp);
			}

		if (ipv6.startsWith(":")) ipv6 = "0" + ipv6;
		if (ipv6.endsWith(":")) ipv6 += "0";
		String[] outputs = ipv6.split(":");
		String tmp;
		String answer = "";

		for (int i = 0; i < 8; i++) {
			tmp = outputs[i];
			while (tmp.length() < 4) tmp = "0" + tmp;
			answer += tmp;
			if (i != 7) answer += ":";
		}
		System.out.println(answer);
	}
    
	static public int count(String s) {
		return s.length() - s.replace(":", "").length();
	}
}