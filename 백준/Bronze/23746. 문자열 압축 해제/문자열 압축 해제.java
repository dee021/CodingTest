import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		String[] inputs;
		Map<Character, String> ptn = new HashMap();
		
		for (int i = 0; i < n ; i++) {
			inputs = br.readLine().strip().split(" ");
			ptn.put(inputs[1].charAt(0), inputs[0]);
		}

		String str = br.readLine();
		for (char c:str.toCharArray()) {
			sb.append(ptn.get(c));
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		System.out.println(sb.substring(Integer.parseInt(st.nextToken())-1, Integer.parseInt(st.nextToken())));
		br.close();
		
	}
}