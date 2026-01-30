import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] f = new int[10], revF = new int[10];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 10; i++) {
        	f[i] = Integer.parseInt(st.nextToken());
        	revF[f[i]] = i;
        }
        
        st = new StringTokenizer(br.readLine(), " ");
        int ab = conv(revF, Integer.parseInt(st.nextToken())) + conv(revF, Integer.parseInt(st.nextToken()));

        System.out.println(conv(f, ab));
        br.close();
    }
	
	static int conv(int[] f, int k) {
		StringBuilder sb = new StringBuilder();
		
		for (char m: String.valueOf(k).toCharArray()) sb.append(f[m - '0']);

		return Integer.parseInt(sb.toString());
	}
}