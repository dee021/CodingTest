import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		String[] word = new String[n*2-1];
		for (int i = 0; i < n; i++) {
			word[2*i] = br.readLine().strip();
			m -= word[2*i].length();
		}
		
		
		int len = m/(n-1);
		m -= len*(n-1);
		String underBar = "";
		
		for (int i = 0; i < len; i++) underBar += "_";
		
		for (int i = 1; i < n; i++) {
			word[2*i-1] = underBar;
			if (m > 0 && word[2*i].charAt(0) >= 'a') {
				word[2*i-1] += "_";
				m--;
			}
		}
        
		int idx = 2*n-3;
		while (m > 0 && idx> 0) {
			if (word[idx].length() == len) {
				word[idx] += "_";
				m--;
			}
			idx -= 2;
		}

		for (String s:word) {
			System.out.print(s);
		}

		br.close();
	}	
}