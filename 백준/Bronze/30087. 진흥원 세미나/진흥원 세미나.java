import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Map;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Map <String, String> room = new HashMap();
		room.put("Algorithm", "204");
		room.put("DataAnalysis", "207");
		room.put("ArtificialIntelligence", "302");
		room.put("CyberSecurity", "B101");
		room.put("Network", "303");
		room.put("Startup", "501");
		room.put("TestStrategy", "105");
		
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			System.out.println(room.get(br.readLine().strip()));
		}
		br.close();
	}	
}