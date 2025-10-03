import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

class ComparatorImpl implements Comparator<int[]> {

	@Override
	public int compare(int[] o1, int[] o2) {
		// TODO Auto-generated method stub
		int diff1 = o1[0] - o1[1], diff2 = o2[0] - o2[1];
		
		if (diff1 == diff2) return o2[0] - o1[0];
		return diff2 - diff1;
	}
}

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken()) / 1000, ans = 0;
        ArrayList<int[]> al = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        	
        	if (b >= a) {
        		ans += b;
        		x--;
        	} else al.add(new int[] {a, b});
        }
        
        Collections.sort(al, new ComparatorImpl());
        
        for (int i = 0; i < al.size(); i++) {
        	if (x - 5 >= al.size() - i - 1) {
        		ans += al.get(i)[0];
        		x -= 5;
        	} else {
        		ans += al.get(i)[1];
        		x--;
        	}
        }
        
        System.out.println(ans);
        br.close();
    } 
}