import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        boolean psb = true, tmp = false;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        ArrayList<Integer> al = new ArrayList<>();
        while (n-- > 0) {
        	int t = Integer.parseInt(st.nextToken());
        	tmp = false;
        	for (int i = 0; i < Math.min(4, al.size()); i++) {
        		if (al.get(i) < t) {
        			al.remove(i);
        			al.add(i, t);
        			tmp = true;
        			break;
        		}
        	}
        	if (!tmp) {
        		if (al.size() < 4) al.add(t);
        		else {
        			psb = false;
        			break;
        		}
        	}
        	al.sort(Comparator.reverseOrder());
        }
        
        System.out.println(psb?"YES":"NO");
        br.close();
    }
}