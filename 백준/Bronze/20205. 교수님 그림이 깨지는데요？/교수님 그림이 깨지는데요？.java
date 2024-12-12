import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		String[] input;
		String line;
		StringBuffer sb = new StringBuffer();

		for (int r = 0; r < n; r++) {
			input = br.readLine().strip().split(" ");
			line = "";
			for (int c = 0; c < n; c++) {
				for (int i = 0; i < k; i++) {
					if (c + i > 0) line += " ";
					line += input[c];
				}
			}
			
			for (int i = 0; i < k; i++)
				sb.append(line+"\n");
		}
		
		System.out.println(sb);
		br.close();
	}	
}