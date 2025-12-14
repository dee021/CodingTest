import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        double res = 0;
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = m-1; i >= 0; i--) res += Integer.parseInt(st.nextToken()) * Math.pow(a, i);
        
        System.out.println(conv((int)res, b));
        br.close();
    }
    
    static String conv(int k, int b) {
    	ArrayList<Integer> al = new ArrayList<>();
    	
    	while (k >= b) {
    		al.add(k%b);
    		k /= b;
    	}
    	if (k > 0) al.add(k);
    	
    	StringBuilder sb = new StringBuilder();
    	for (int i = al.size()-1; i > -1; i--) {
    		sb.append(al.get(i)).append(" ");
    	}
    	return sb.toString();
    }
}