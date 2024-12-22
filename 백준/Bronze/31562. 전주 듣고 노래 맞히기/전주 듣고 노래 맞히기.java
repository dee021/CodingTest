import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		Map<String, String> song = new HashMap();
		String title, melody;
		for (int i =0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			st.nextToken();
			title = st.nextToken();
			melody = "";
			for (int j = 0; j < 3; j++) melody += st.nextToken();
			if (song.containsKey(melody)) song.put(melody, "?");
			else song.put(melody, title);
		}
		
		for (int i =0; i < m; i++) {
			melody = "";
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 3; j++) melody += st.nextToken();
			if (song.containsKey(melody)) System.out.println(song.get(melody));
			else System.out.println("!");
		}

		br.close();
	}	
}