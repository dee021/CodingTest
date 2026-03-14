import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class ComparatorImpl implements Comparator<String> {
	@Override
	public int compare(String e1, String e2) {
		// TODO Auto-generated method stub
		
		if (e1.length() == e2.length()) return e1.compareTo(e2);
		return e1.length() - e2.length();
	}
	
}

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), cnt = 0;
        ArrayList[] cl = new ArrayList[11];
        for (int i = 1; i < 11; i++) cl[i] = new ArrayList<String>();
        
        while (true) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int c = Integer.parseInt(st.nextToken());
        	String nm = st.nextToken();
        	
        	if (nm.equals("0")) break;
        	if (cl[c].size() < m && cnt < 500) {
        		cl[c].add(nm);
        		cnt++;
        	}
        }
        
        for (int c = 1; c <= 10; c += 2) {
        	if (!cl[c].isEmpty()) {
        		Collections.sort(cl[c], new ComparatorImpl());
        		
        		for (int i = 0; i < cl[c].size(); i++) sb.append(c).append(" " + cl[c].get(i) + "\n");
        	}
        	
        	if (c == 9) c = 0;
        }
        
        System.out.print(sb);
        br.close();
    }
}