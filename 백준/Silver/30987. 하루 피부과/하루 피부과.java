import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int x1 = Integer.parseInt(st.nextToken()), x2 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		
		System.out.println(Math.round(a/3*(Math.pow(x2, 3)-Math.pow(x1, 3)) 
				+ (b-d)/2*(Math.pow(x2, 2)-Math.pow(x1, 2))
				+ (c-e)*(x2-x1)));

		br.close();
	}	
}