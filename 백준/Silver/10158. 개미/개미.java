import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int w = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(br.readLine()), dx = 1, dy = 1, dis;
		
        x = (x+t) % (2*w);
		y = (y+t) % (2*h);
		
		if (x > w) x -= 2*(x - w);
		if (y > h) y -= 2*(y - h);
        
        bw.write(x + " ");
		bw.write(y + "\n");
		bw.flush();
		bw.close();
		br.close();
		
	}
}