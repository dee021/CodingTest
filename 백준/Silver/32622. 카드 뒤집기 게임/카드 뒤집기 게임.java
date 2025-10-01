import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int pre = Integer.parseInt(st.nextToken());
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1));
        
        for (int i = 1; i < n; i++) {
        	int cur = Integer.parseInt(st.nextToken());
        	if (pre == cur) al.set(al.size()-1, al.get(al.size()-1)+1);
        	else {
        		al.add(1);
        		pre = cur;
        	}
        }
        
        int max = 0, sum = 0;
        for (int i = 0; i < al.size(); i++) {
        	sum += al.get(i);
        	if (i > 1) sum -= al.get(i-2);
        	
        	max = Math.max(max, sum);
        }
        
        System.out.println(max);
        br.close();
    }
}