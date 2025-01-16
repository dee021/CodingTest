import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "|");

		int major = 0, minor = 0;
		String m = ""; String ans;

		while (st.hasMoreTokens()) {
			m = st.nextToken();
			switch (m.charAt(0)) {
			case 'C':
				major++;
				break;
			case 'F':
				major++;
				break;
			case 'G':
				major++;
				break;
			case 'A':
				minor++;
				break;
			case 'D':
				minor++;
				break;
			case 'E':
				minor++;
				break;
			}
		}
		char l = m.charAt(m.length()-1);
		if (major > minor) ans = "C-major";
		else if(major < minor) ans = "A-minor";
		else if(l == 'C' || l == 'F' || l == 'G') ans = "C-major";
		else ans = "A-minor";
		
		System.out.println(ans);

		br.close();
	}	
}