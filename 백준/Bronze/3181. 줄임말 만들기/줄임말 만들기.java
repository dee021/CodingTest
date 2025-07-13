import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int g = 'a' - 'A';
        Set<String> ignore = new HashSet(Arrays.asList("i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili"));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()) {
        	String t = st.nextToken();
        	if (sb.length() < 1 || !ignore.contains(t)) sb.append((char)(t.charAt(0)-g));
        }
        
        System.out.println(sb);
        br.close();
    }
}