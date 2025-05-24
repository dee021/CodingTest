import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
        	st = new StringTokenizer(br.readLine(), " ");
        	long n = Long.parseLong(st.nextToken()), k = Long.parseLong(st.nextToken()), days = 0;

        	sb.append(Long.toBinaryString(n).length() + k).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}