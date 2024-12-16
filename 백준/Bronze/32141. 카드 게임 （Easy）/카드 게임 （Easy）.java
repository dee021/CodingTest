import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
		int n = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken()), cnt = 0;
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i =0; i < n && h > 0; i++) {
			h -= Integer.parseInt(st.nextToken());
			cnt++;
		}

		System.out.println((h>0)?-1:cnt);

		br.close();
	}	
}