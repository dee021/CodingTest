import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine()), max = 0, cnt = 0, no = 0, o;
		for (int i =0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			o = Integer.parseInt(st.nextToken());
			if (o == 1) {
				cnt++;
				if (max < cnt) {
					max = cnt;
					no = Integer.parseInt(st.nextToken());
					}
				else if (max == cnt) no = Math.min(no, Integer.parseInt(st.nextToken()));
			} else cnt--;
		}
		System.out.println(max + " " + no);
        
		br.close();
	}	
}