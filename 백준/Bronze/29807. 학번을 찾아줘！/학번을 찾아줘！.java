import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), res = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int k = Integer.parseInt(st.nextToken());
        int m = st.hasMoreTokens()? Integer.parseInt(st.nextToken()): 0;
        int e = st.hasMoreTokens()? Integer.parseInt(st.nextToken()): 0;
        int s = st.hasMoreTokens()? Integer.parseInt(st.nextToken()): 0;
        int l = st.hasMoreTokens()? Integer.parseInt(st.nextToken()): 0;
        
        if (k > e) res += (k-e) * 508;
        else res += (e-k) * 108;
        
        if (m > s) res += (m-s) * 212;
        else res += (s-m) * 305;
        
        res += l * 707;
        
        System.out.println(res * 4763);
        br.close();
    }
}