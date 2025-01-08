import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int hi, arc;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		hi = Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken());
		arc = Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken());
		
		System.out.println(hi-arc);

		br.close();
	}	
}